package com.josh.pms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableWebMvc
@EnableSwagger2
public class ApplicationConfigration {
	
	 @Bean
	    Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(getInfo())
	                .select()
	                .apis(RequestHandlerSelectors.any())
	                .paths(PathSelectors.any())
	                .build();
	    }

	    private ApiInfo getInfo(){
	        return new ApiInfoBuilder().title("Project Billing Microservice")
	                .version("1.0.0")
	                .description("we manage all billing from here.   ")
	                .build();
	    }
	    
		/*
		 * @Bean public ServerCodecConfigurer serverCodecConfigurer() { return
		 * ServerCodecConfigurer.create(); }
		 */

		
	

}
