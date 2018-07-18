package com.haoze.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 跨域设置
 * @author maxl
 * @time 2018-07-18。
 */
@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                //registry.addMapping("/api/**")
                registry.addMapping("/**")
                        //.allowedOrigins("http://192.168.0.104:8082")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "DELETE", "PUT")
                        .allowedHeaders("Authorization","Accept","Origin","Content-Type")
                        .allowCredentials(false).maxAge(3600);
            }
        };
    }


}
