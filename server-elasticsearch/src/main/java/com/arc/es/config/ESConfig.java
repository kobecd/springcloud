package com.arc.es.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.URL;


/**
 * @author: 叶超
 * @since: 2019/1/31 22:11
 */
@Configuration
public class ESConfig implements FactoryBean<RestClient>, InitializingBean, DisposableBean {
    @Value("${spring.data.elasticsearch.cluster-nodes}")
    private String clusterNodes;

    private static final Logger LOG = LoggerFactory.getLogger(ESConfig.class);
    private RestClient restHighLevelClient;

    @Override
    public void destroy() throws Exception {
        try {
            if (restHighLevelClient != null) {
                restHighLevelClient.close();
            }
        } catch (IOException e) {
            LOG.error("Error closing ElasticSearch client: ", e);
        } finally {

        }
    }

    /**
     * 控制Bean的实例化过程
     *
     * @return
     * @throws Exception
     */
    @Override
    public RestClient getObject() throws Exception {
        return restHighLevelClient;
    }

    /**
     * 获取接口返回的实例的class
     *
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return RestClient.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        String[] urlList = clusterNodes.split(",");
        HttpHost[] nodes = new HttpHost[urlList.length];
        for (int i = 0; i < urlList.length; i++) {
            URL url = new URL(urlList[i]);
            HttpHost node = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
            nodes[i] = node;
        }
        RestClientBuilder builder = RestClient.builder(nodes);
        restHighLevelClient = new RestClient(builder);
    }
}
//https://www.cnblogs.com/guozp/archive/2018/04/02/8686904.html 版本问题
//https://spring.io/projects/spring-framework
