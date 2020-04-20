package myspring.di.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Component
public class Hello {
    @Value("${myname}")
    private String name;

//    @Autowired
//    @Qualifier("${printer1}")
    @Resource(name = "${printer1}")
    private Printer printer;

    private List<String> names;
    private Map<String,Integer> ages;


    public Hello() {

    }

    public Hello(String name, Printer printer) {
        this.name = name;
        this.printer = printer;
    }

    public void setAges(Map<String, Integer> ages) {
        this.ages = ages;
    }

    public List<String> getNames() {
        return names;
    }


    public String sayHello(){
        return "Hello" + name;
    }

    public void print(){
        this.printer.print(sayHello());
    }
}
