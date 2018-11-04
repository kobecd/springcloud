package com.del.clientrabbitmq.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQReceiverConfig {

/*


//    @RabbitListener(queues="queue")    //监听器监听指定的Queue
//    public void processC(User user) {
//        System.out.println("Receive:"+user);
//    }


    //    @RabbitListener(queues="queue_string")    //监听器监听指定的Queue
    @RabbitListener(queues = "queue_obj")    //监听器监听指定的Queue
    public void processC(User user) {
        System.out.println("Receive  :" + user);
        System.out.println("Receive  :" + user);
        System.out.println("Receive  :" + user);
        System.out.println("Receive  :" + user);
    }
*/


//    @Bean
//    public Queue queue() {
//        return new Queue("queue");
////        return new Queue("topic");
//    }

    @RabbitListener(queues="topic.message")    //监听器监听指定的Queue
    public void process1(String str) {
        System.out.println("message:"+str);
    }

    @RabbitListener(queues="topic.messages")    //监听器监听指定的Queue
    public void process2(String str) {
        System.out.println("messages:"+str);
    }
}

//2.下面重点介绍一下消费者和生产者之间对象的传输。
//对象的传输，要现在生产者（A）中进行序列化，即把对象转化为字节数组进行传输，在消费者中，再把转化的字节数组反序列化为对象。序列化和反序列化的方法很多，这里采用的是java的Serializable 接口
//1>.在生产者（项目A）和消费者（项目B）的项目中创建实体类。
//！注意！：
// 新建实体类Boy.java 该实体类在项目A、B中的位置，必须一致，
// 即包名必须一致*，在本项目中，Boy.java 在项目A、B中都是： import com.fengdonghao.shiro.bean.Boy;
//实体类也要一致。
//参考文章
//https://www.cnblogs.com/hlhdidi/p/6535677.html