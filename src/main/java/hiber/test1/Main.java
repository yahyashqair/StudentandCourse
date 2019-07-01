import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main(String[] arg){

        ApplicationContext context = new ClassPathXmlApplicationContext("com/beans.xml");
        person obj = (person) context.getBean("person");
        System.out.println( obj.toString());
    }
}
