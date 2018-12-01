package lone.wolf.springbootstudy.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/28 0:01
 */
@Configuration
public class JmsConfig {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("commom.queue");
    }
}
