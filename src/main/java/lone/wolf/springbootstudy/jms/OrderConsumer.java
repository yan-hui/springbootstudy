package lone.wolf.springbootstudy.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/27 23:49
 */
@Component
public class OrderConsumer {
    @JmsListener(destination = "order.queue")
    public void receiveQueue(String text) {
        System.out.println("OrderConsumer收到的报文为：" + text);
    }
}
