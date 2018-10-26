package com.wlt.mall.config;

import org.springframework.amqp.core.Queue;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述:配置广播模式或者订阅模式队列
 * <p>
 * Fanout 就是我们熟悉的广播模式或者订阅模式，给Fanout交换机发送消息，绑定了这个交换机的所有队列都收到这个消息。
 *
 * @author yanpenglei
 * @create 2017-10-16 16:47
 **/
@Configuration
public class RabbitFanoutConfig {

    // 消息队列名称 学生消息队列
    final static String STD = "fanout1";

    // 教师消息队列
    final static String TEA = "fanout2";

    @Bean
    public Queue genQueSt() {
        return new Queue("fanout1");
    }

    @Bean
    public Queue genQueTea() {
        return new Queue("fanout2");
    }

    /**
     * 任何发送到Fanout Exchange的消息都会被转发到与该Exchange绑定(Binding)的所有队列上。
     */
    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }



    Binding bindingExchangeQueueSt(Queue queueSt, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueSt).to(fanoutExchange);
    }

    // 交换机绑定消息队列

    Binding bindingExchangeQueueTea(Queue queueTea, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueTea).to(fanoutExchange);
    }

}
