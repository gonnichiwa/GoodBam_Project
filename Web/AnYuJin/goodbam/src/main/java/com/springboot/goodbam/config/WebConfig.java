package com.springboot.goodbam.config;//package com.springboot.georlock.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/asset/**")
                .addResourceLocations("classpath:/asset/")
                .setCachePeriod(20);
    }
}
