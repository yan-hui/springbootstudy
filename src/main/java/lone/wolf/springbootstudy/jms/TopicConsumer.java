package lone.wolf.springbootstudy.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/27 23:49
 */
@Component
public class TopicConsumer {
    @JmsListener(destination = "video.topic",containerFactory = "jmsListenerContainerTopic")
    public void receiveTopic1(String text) {
        System.out.println("video.topic 消费者：receiveTopic1=" + text);
    }
    @JmsListener(destination = "video.topic",containerFactory = "jmsListenerContainerTopic")
    public void receiveTopic2(String text) {
        System.out.println("video.topic 消费者：receiveTopic2=" + text);
    }
    @JmsListener(destination = "video.topic")
    public void receiveTopic3(String text) {
        System.out.println("video.topic 消费者：receiveTopic3=" + text);
    }
}
