package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static com.google.common.collect.Lists.*;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	 @Bean
	    public Docket api(){
	        return new Docket(DocumentationType.SWAGGER_2)
	            .select()
	            
	            .apis(RequestHandlerSelectors.any())
	            .paths(PathSelectors.any())
	            .build()
	            .globalOperationParameters(
	                    newArrayList(new ParameterBuilder()
	                            .name("Authorization")
	                            .description("Authorization Token")
	                            .modelRef(new ModelRef("string"))
	                            .parameterType("header")
	                            .required(false)
	                            .build(),
	                             new ParameterBuilder()
		                            .name("Content")
		                            .description("Content Format")
		                            .modelRef(new ModelRef("string"))
		                            .parameterType("header")
		                            .required(false)
		                            .build()));
	           
	    }

	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	            .title("TITLE")
	            .description("DESCRIPTION")
	            .version("VERSION")
	            .termsOfServiceUrl("http://terms-of-services.url")
	            .license("LICENSE")
	            .licenseUrl("http://url-to-license.com")
	            .build();
	    }

	}

