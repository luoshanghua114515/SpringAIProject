package com.luoshanghua.com.config;

import com.luoshanghua.com.interceptor.LoginInterceptor;
import com.luoshanghua.com.interceptor.RefreshTokenInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Slf4j
public class MVCConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Autowired
    private RefreshTokenInterceptor refreshTokenInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("开始注册定义拦截器");
        //order属性设置拦截器的触发顺序，order值越小优先度越高，order相同则先注册的优先度高
        InterceptorRegistration r1 = registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/ai/chat/**")
                .excludePathPatterns(
                        "/ai/chat/test",
                        "/ai/user/login",
                        "/upload/**")
                .order(1);
        InterceptorRegistration r2 = registry.addInterceptor(refreshTokenInterceptor)
                .addPathPatterns("/**").order(0);
    }

    /**
     * 设置静态资源映射
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("classpath:/static/upload/");
    }
}
