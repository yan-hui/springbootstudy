package lone.wolf.springbootstudy.jms;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/4 23:37
 */
@Component
public class MsgProducer {
    /**
     * 生产者的组名
     */
    @Value("${apache.rocketmq.producer.producerGroup}")
    private String producerGroup;
    /**
     * NameServer地址
     */
    @Value("${apache.rocketmq.namesrvAddr}")
    private String namesrvAddr;

    private DefaultMQProducer  producer;

    public DefaultMQProducer getProducer() {
        return this.producer;
    }

    @PostConstruct
    public void defaultMQProducer(){
        producer = new DefaultMQProducer(producerGroup);
        //指定NameServer地址，多个地址以 ; 隔开.如 producer.setNamesrvAddr("127.0.0.1:9876;192.168.153.66:9876");
        producer.setNamesrvAddr(namesrvAddr);
        producer.setVipChannelEnabled(false);
        try {
            /**
             * producer对象在使用之前必须调用start初始化，只能初始化一次
             */
            producer.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    //producer.shutdown(); 一般在应用上下文关闭的时候进行关闭，用上下文监听器

    }
}
