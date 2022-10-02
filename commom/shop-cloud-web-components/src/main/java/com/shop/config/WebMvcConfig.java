package com.shop.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    /**
     *静态资源映射
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("file:/Users/dingshuangqiu/Documents/images/") //此处不要忘了file:,否则不显示
                .addResourceLocations("classpath:/META-INF/resuorces/");//为swagger2做映射

    }

    @Bean
    public RestTemplate build(RestTemplateBuilder builder) {
        return builder.build();
    }


//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(userTokenInterceptor())
//                .addPathPatterns("/user/**")
//                .addPathPatterns("/userInfo/**")
//                .addPathPatterns("/center/**")
//                .addPathPatterns("/mycomments/**")
//                .addPathPatterns("/myorders/**")
//                .addPathPatterns("/address/**")
//                .addPathPatterns("/orders/**")
//                .addPathPatterns("/shopcart/**");
//        WebMvcConfigurer.super.addInterceptors(registry);
//    }
//
//    @Bean
//    public UserTokenInterceptor userTokenInterceptor(){
//        return new UserTokenInterceptor();
//    }
}
