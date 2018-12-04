package lone.wolf.springbootstudy.service;


import javax.jms.Destination;

/**
 * @Description 消息生产
 * @Author hechunhui
 * @Created 2018/11/27 23:39
 */
public interface ProducerService {
    /**
     * 指定消息队列和消息
     *
     * @param destination 发送到的队列
     * @param message 待发送的消息
     */
    public void sendMessage(Destination destination, final String message);

    /**
     * 使用默认消息队列，发送消息
     *
     * @param message 待发送的消息
     */
    public void sendMessage(final String message);

    /**
     * 消息发布者
     * @param msg
     * @return
     */
    public void publish(String msg);
}
