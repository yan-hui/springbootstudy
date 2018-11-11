package lone.wolf.springbootstudy.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/11 18:14
 */
@Component
@PropertySource({"classpath:application.properties"})
@ConfigurationProperties(prefix = "test")
public class MySetting {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
