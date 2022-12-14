package com.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)//选择swagger类型
                .apiInfo(apiInfo())
                .select().
                apis(
                        //RequestHandlerSelectors.basePackage("com.food.controller"))//扫描包
                RequestHandlerSelectors.withClassAnnotation(RestController.class))//根据此注解来扫描
                .paths(PathSelectors.any())//所有的controller都被扫描
                .build();

    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("天天吃货借口").description("").version("1.0.0").contact(new Contact("dsq","","")).build();
    }
}
