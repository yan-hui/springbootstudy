package lone.wolf.springbootstudy.service.impl;

import lone.wolf.springbootstudy.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @Description 消息生产者业务类
 * @Author hechunhui
 * @Created 2018/11/27 23:44
 */
@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private Queue queue;
    @Autowired
    private Topic topic;

    /**
     *发送消息的broker对象
     *
     */
    @Autowired
    private JmsMessagingTemplate jmsTemplate;


    @Override
    public void sendMessage(Destination destination, String message) {
        jmsTemplate.convertAndSend(destination,message);
    }

    @Override
    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(this.queue,message);

    }
    /**********************发布订阅************************************/
    @Override
    public void publish(String msg) {
        jmsTemplate.convertAndSend(this.topic,msg);
    }
}
