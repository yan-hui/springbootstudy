package lone.wolf.springbootstudy.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

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

    /**
     * 主题对象交由spring管理
     * @return
     */
    @Bean
    public Topic topic(){
        return new ActiveMQTopic("video.topic");
    }

    /**
     * 同时支持点对点和发布订阅，需要给topic定义独立的jmsListenerContainer
     * @param connectionFactory
     * @return
     */
    @Bean(name = "jmsListenerContainerTopic")
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory connectionFactory){
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setPubSubDomain(true);
        factory.setConnectionFactory(connectionFactory);
        return factory;
    }
}
