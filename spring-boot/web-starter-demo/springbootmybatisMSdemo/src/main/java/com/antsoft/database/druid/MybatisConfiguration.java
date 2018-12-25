package com.antsoft.database.druid;

import com.antsoft.database.mybatis.DbContextHolder;
import com.antsoft.database.mybatis.ReadWriteSplitRoutingDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.aspectj.apache.bcel.util.ClassLoaderRepository;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by Jason on 2017/3/6.
 */
@Configuration
@AutoConfigureAfter({DataSourceConfiguration.class})
public class MybatisConfiguration extends MybatisAutoConfiguration {

    private static Log logger = LogFactory.getLog(MybatisConfiguration.class);

    private RelaxedPropertyResolver propertyResolver;

    @Resource(name = "masterDataSource")
    private DataSource masterDataSource;
    @Resource(name = "slaveDataSource")
    private DataSource slaveDataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        logger.info("-------------------- 重载父类 sqlSessionFactory init ---------------------");
        return super.sqlSessionFactory(roundRobinDataSouceProxy());
    }


//    @Override
//    public void setEnvironment(Environment environment) {
//        this.propertyResolver = new RelaxedPropertyResolver(environment,"mybatisplus.");
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    public SqlSessionFactory sqlSessionFactory(){
//        try{
//            SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//            sessionFactoryBean.setDataSource(roundRobinDataSouceProxy());
//            sessionFactoryBean.setTypeAliasesPackage(propertyResolver.getProperty("typeAliasesPackage"));
//            sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(
//                    propertyResolver.getProperty("mapperLocations")
//            ));
//            sessionFactoryBean.setConfigLocation(new DefaultResourceLoader().getResource(
//                    propertyResolver.getProperty("configLocation")
//            ));
//            return sessionFactoryBean.getObject();
//        }catch (Exception e){
//            logger.warn("Could not confiure mybatisplus session factory");
//            return null;
//        }
//    }

    public AbstractRoutingDataSource roundRobinDataSouceProxy(){
        ReadWriteSplitRoutingDataSource proxy = new ReadWriteSplitRoutingDataSource();
        Map<Object,Object> targetDataResources = new ClassLoaderRepository.SoftHashMap();
        targetDataResources.put(DbContextHolder.DbType.MASTER,masterDataSource);
        targetDataResources.put(DbContextHolder.DbType.SLAVE,slaveDataSource);
        proxy.setDefaultTargetDataSource(masterDataSource);
        proxy.setTargetDataSources(targetDataResources);
        return proxy;
    }
}
