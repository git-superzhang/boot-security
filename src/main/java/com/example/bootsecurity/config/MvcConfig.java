package com.example.bootsecurity.config;


import org.springframework.scheduling.annotation.Async;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @ClassName: MvcConfig
 * @Description:
 * @date: 2022/5/10 20:58
 * @version: 1.0.0
 */
public class MvcConfig implements WebMvcConfigurer {


    @Async
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toLogin").setViewName("login");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        WebMvcConfigurer.super.addCorsMappings(registry);
    }
}
