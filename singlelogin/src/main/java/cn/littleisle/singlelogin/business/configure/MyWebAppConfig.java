package cn.littleisle.singlelogin.business.configure;

import cn.littleisle.singlelogin.business.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MyWebAppConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration it= registry.addInterceptor(new LoginInterceptor());
        it.addPathPatterns("/**");
        it.excludePathPatterns("/signIn");
        it.excludePathPatterns("/signUp");
        it.excludePathPatterns("/login");
    }
}
