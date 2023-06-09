package edu.czjt.reggie.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues = "TestDirectQueue")
public class Consumerconfig {
    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("DirectReceiver监听到消费者更新操作添加了: " + testMessage.toString());
    }

}
