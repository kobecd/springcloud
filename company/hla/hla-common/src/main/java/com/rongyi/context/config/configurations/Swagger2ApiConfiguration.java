package com.rongyi.context.config.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2//通过注解EnableSwagger2声明Swagger的可用性，此处会定义一个类型为Docket的bean，
@Configuration
@EnableConfigurationProperties
public class Swagger2ApiConfiguration {
	
	@Autowired
	private Swagger2Properties prop;
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()// 选择那些路径和api会生成document
				.apis(RequestHandlerSelectors.basePackage(prop.getBasePackage()))
//                .apis(RequestHandlerSelectors.any()) // 对所有api进行监控
				.paths(PathSelectors.any())// 对所有路径进行监控
				.build();
	}

	//一些描述信息
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title(prop.getTitle())
				.description(prop.getDescription())
				.termsOfServiceUrl(prop.getTermsOfServiceUrl())
				.contact(new Contact(prop.getContactName(), prop.getContactUrl(), prop.getContactEmail()))
				.version(prop.getVersion())
				.build();
	}
	
	@Getter
	@Setter
	@Component
	@ConfigurationProperties(prefix = "app.swagger2")
	public static class Swagger2Properties {
		
		private String basePackage;

		private String title;

		private String description;

		private String version;

		private String termsOfServiceUrl;
		
		private String contactName;
		
		private String contactUrl;
		
		private String contactEmail;
		
	}

}
