package com.shop.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 跨域信息配置
 */
@Configuration
public class CorsConfig {

    CorsConfig(){

    }


    @Bean
   public CorsFilter corsFilter() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("http://localhost:8080");
        //1.设置允许的请求方式
        configuration.addAllowedMethod("*");
        //设置允许的头部
        configuration.addAllowedHeader("*");

        //设置是否允许发送cookie信息
        configuration.setAllowCredentials(true);
        //为URL添加映射路径
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**", configuration);
        return new CorsFilter(corsSource);
    }

}
