package cheng.spring;

import javax.jms.Destination;

/**
 * Created by cheng on 2017/9/8.
 */
public interface ProducerService {
    /**
     * 向指定队列发送消息
     */
    void sendMessage(Destination destination, final String msg);
    /**
     * 向默认队列发送消息
     */
    void sendMessage(final String msg);
}
