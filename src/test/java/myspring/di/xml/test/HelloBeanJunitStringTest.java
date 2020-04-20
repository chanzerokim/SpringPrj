package myspring.di.xml.test;

import myspring.di.xml.Hello;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/beans.xml")
public class HelloBeanJunitStringTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void test1(){
        Hello hello = (Hello)context.getBean("hello2");

        Assert.assertEquals(3,hello.getNames().size());
        System.out.println(":::::::::::::::::" + hello.getNames().size());

        List<String> list = hello.getNames();
        for (String value: list) {
            System.out.println(":::::::::::: " + value);
        }
    }
}
