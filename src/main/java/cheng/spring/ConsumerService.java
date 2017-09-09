package cheng.spring;
import javax.jms.Destination;
/**
 * Created by cheng on 2017/9/8.
 */
public interface ConsumerService {
    /**
     * 接受消息
     */
    void receive(Destination destination);
}
