package lone.wolf.springbootstudy.intercepter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description 拦截器
 * @Author hechunhui
 * @Created 2018/11/7 23:28
 */
@Configuration
public class UserWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截/api2下除了anni下的所有方法,
        registry.addInterceptor(new FirstInteceptor()).addPathPatterns("/api2/*/**").excludePathPatterns("/api2/anni/**");
         //registry.addInterceptor(new SecondInteceptor()).addPathPatterns("/api3/*/**");
         registry.addInterceptor(new SecondInteceptor()).addPathPatterns("/api2/*/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
