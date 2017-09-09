package cheng;

import cheng.spring.ConsumerService;
import cheng.spring.ProducerService;
import cheng.spring.SpringContainer;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jms.Destination;

/**
 * Created by cheng on 2017/9/8.
 */

public class springjmstest {
    @Test
    public void producerTest(){
        // 加载spring
        ClassPathXmlApplicationContext springContext = SpringContainer.getSpringContext();
        ProducerService producerService = (ProducerService)springContext.getBean("producerService");
        ConsumerService consumerService = (ConsumerService)springContext.getBean("consumerService");

        Destination destination = (Destination)springContext.getBean("queueDestination");
        producerService.sendMessage("测试消息队列");

        consumerService.receive(destination);
    }
}
