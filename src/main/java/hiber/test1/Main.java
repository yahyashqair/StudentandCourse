package hiber.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] arg){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Crud crud=(Crud)context.getBean("crud");
        crud.readData();
    }
}
