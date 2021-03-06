package myspring.di.xml.test;

import myspring.di.xml.Hello;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/beans.xml")
public class HelloBeanTestTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void bean1(){
        Hello hello = (Hello)context.getBean("hello");

        assertEquals("HelloSpring" , hello.sayHello());

    }
}