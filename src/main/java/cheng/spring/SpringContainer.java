package cheng.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cheng on 2017/9/8.
 */
public class SpringContainer {
    public static final String DEFAULT_SPRING_CONFIG = "classpath:*.xml";

    public static ClassPathXmlApplicationContext getSpringContext() {
        System.out.println(SpringContainer.class.getResource("/").getPath());
        return MySpringContainer.context;
    }

    private static class MySpringContainer{

        private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(DEFAULT_SPRING_CONFIG.split("[,\\s]+"));
    }
}
