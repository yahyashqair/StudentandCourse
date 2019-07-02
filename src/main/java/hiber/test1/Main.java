package hiber.test1;

import hiber.test1.hiber.DAO.CrudStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] arg) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CrudStudent crud=(CrudStudent)context.getBean("crudStudent");
        crud.readData();

    }
}
