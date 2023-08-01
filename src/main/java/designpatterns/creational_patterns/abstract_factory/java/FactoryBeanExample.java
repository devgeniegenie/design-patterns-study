package designpatterns.creational_patterns.abstract_factory.java;

import designpatterns.creational_patterns.factory_method.after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Ship whiteship = applicationContext.getBean("whiteship", Ship.class);
        System.out.println(whiteship.getName());*/

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship bean = applicationContext2.getBean(Ship.class);
        System.out.println(bean);
    }
}
