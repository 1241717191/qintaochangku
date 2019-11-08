package com.bdqn;

        import com.bdqn.classInfo.A;
        import org.apache.log4j.Logger;
        import org.junit.jupiter.api.Test;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Damo01 {
    @Test
    public void test() {
        Logger logger= Logger.getLogger(Damo01.class);
        logger.info("进入test");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = (A)context.getBean("a");
        A ab= (A)context.getBean("ab");
        a.showInfo();
        ab.showInfo();
    }
}