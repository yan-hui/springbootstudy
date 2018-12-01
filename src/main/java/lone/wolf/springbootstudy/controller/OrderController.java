package lone.wolf.springbootstudy.controller;

import lone.wolf.springbootstudy.service.ProducerService;
import lone.wolf.springbootstudy.utils.JsonResult;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/27 23:51
 */
@RestController
@RequestMapping("/v1")
public class OrderController {
    @Autowired
    private ProducerService producerService;

    @GetMapping("/order")
    public JsonResult order(String msg) {
        //生成消息队列地址
        Destination destination = new ActiveMQQueue("order.queue");
        producerService.sendMessage(destination, msg);
        return JsonResult.success();
    }

    @GetMapping("/common")
    public JsonResult commom(String msg) {
        producerService.sendMessage(msg);
        return JsonResult.success();
    }
}
