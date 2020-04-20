package myspring.di.xml.test;

import myspring.di.annot.Hello;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/annot.xml")
public class HelloBeanAnnotSprintTest {

    @Autowired
    Hello hello;

    @Test
    public void test1(){
        hello.print();
    }
}
