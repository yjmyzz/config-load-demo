package config.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

/**
 * Created by yangjunming on 12/15/15.
 * author: yangjunming@huijiame.com
 */
public class App {

    private static ApplicationContext context;
    private static Logger logger;


    public static void main(String[] args) {

        context = ApplicationContextUtil.getInstance().getContext();
        logger = LoggerFactory.getLogger(App.class);

        System.out.println("start ...");

        logger.debug("debug message");

        logger.info("info message");

        logger.warn("warn message");

        logger.error("error message");

        System.out.println(context.getBean(SampleObject.class));

    }
}

