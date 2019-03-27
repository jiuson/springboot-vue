package com.example.springbootvue.springbootweb.config.cors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @program: springboot-vue
 * @descripttion: cross-domain
 * @author: jiuson
 * @create: 2019-03-27 17:48:50
 */
@Configuration
public class CorsConfig {
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 1.配置允许访问的请求域
        corsConfiguration.addAllowedOrigin("*");
        // 2.配置允许访问的请求Header
        corsConfiguration.addAllowedHeader("*");
        // 3.配置允许访问的请求方法
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 4.配置允许访问的请求路径
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
}
