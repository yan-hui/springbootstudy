package lone.wolf.springbootstudy.controller;

import lone.wolf.springbootstudy.jms.MsgProducer;
import lone.wolf.springbootstudy.utils.JsonResult;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/12/4 23:49
 */
@RestController
@RequestMapping("/v1")
public class OrderController {
    @Autowired
    private MsgProducer msgProducer;

    /**
     * 模拟微信支付回调接口
     *
     * @param msg 支付信息
     * @param tag 消息二级分类
     * @return
     * @throws UnsupportedEncodingException
     * @throws InterruptedException
     * @throws RemotingException
     * @throws MQClientException
     * @throws MQBrokerException
     */
    @GetMapping("order")
    public JsonResult order(String msg, String tag) throws UnsupportedEncodingException, InterruptedException, RemotingException, MQClientException, MQBrokerException {
        /**
         * 创建消息实例，包含topic,tag和消息体
         */
        Message message = new Message("testTopic", tag, msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
        SendResult result = msgProducer.getProducer().send(message);
        System.out.println("发送响应：MsgId: " + result.getMsgId() + ",发送状态： " + result.getSendStatus());
        return JsonResult.success();
    }
}
