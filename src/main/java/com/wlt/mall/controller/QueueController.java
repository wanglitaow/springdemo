package com.wlt.mall.controller;

import com.wlt.mall.domain.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/qu/*")

public class QueueController {


    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping(value = "/direct" ,method = RequestMethod.GET)
    String  direct(){

        String context = "此消息在，默认的交换机模式队列下，有 helloReceiver 可以收到";

        String routeKey = "hello";

        context = "routeKey:" + routeKey + ",context:" + context;

        System.out.println("sendHelloTest : " + context);
        rabbitTemplate.convertAndSend(routeKey, context);
        return context;


    }


    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    String  hello(){

        String context = "此消息在，默认的交换机模式队列下，有 helloReceiver 可以收到";

        String routeKey = "hello";

        context = "routeKey:" + routeKey + ",context:" + context;

        System.out.println("sendHelloTest : " + context);

        this.rabbitTemplate.convertAndSend(routeKey, context);
        return context;


    }


    @RequestMapping(value = "/send" ,method = RequestMethod.GET)
    String  sendPenglei(){

        String context = "此消息在，广播模式或者订阅模式队列下，有 FanoutReceiver1 FanoutReceiver2 可以收到";

        String routeKey = "topic.penglei.net";

        String exchange = "fanoutExchange";

        System.out.println("sendPengleiTest : " + context);

        context = "context:" + exchange + ",routeKey:" + routeKey + ",context:" + context;

        this.rabbitTemplate.convertAndSend(exchange, routeKey, context);
        return context;


    }


    @RequestMapping(value = "/sendall" ,method = RequestMethod.GET)
    String  sendall(){
        String context = "此消息在，广播模式或者订阅模式队列下，有 FanoutReceiver1 FanoutReceiver2 可以收到";

        String routeKey = "topic.souyunku.com";

        String exchange = "fanoutExchange";

        context = "context:" + exchange + ",routeKey:" + routeKey + ",context:" + context;

        System.out.println("sendSouyunkuTest : " + context);

        this.rabbitTemplate.convertAndSend(exchange, routeKey, context);
        return context;

    }



    @RequestMapping(value = "/sendtop" ,method = RequestMethod.GET)
    String  sendtop(){

        String context = "此消息在，配置转发消息模式队列下， 有 TopicReceiver1 TopicReceiver2 TopicReceiver3 可以收到";

        String routeKey = "topic.message";

        String exchange = "topicExchange";

        context = "context:" + exchange + ",routeKey:" + routeKey + ",context:" + context;

        System.out.println("sendMessageTest : " + context);

        this.rabbitTemplate.convertAndSend(exchange, routeKey, context);

        return  context;

    }









}
