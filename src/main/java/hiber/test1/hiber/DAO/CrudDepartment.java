package hiber.test1.hiber.DAO;

import hiber.test1.hiber.Course;
import hiber.test1.hiber.Department;
import hiber.test1.hiber.Student;
import hiber.test1.hiber.test1.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Criteria;
import org.springframework.stereotype.Component;

@Component
public class CrudDepartment {

    Session makesesstions(){

        SessionFactory factory;
        try {

            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.out.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Session session = factory.openSession();
        return session;
    }

    /*
     *   Create Course
     *  */
    Department creatDepartment(String Name){
        Department department = new Department();
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        department.setName(Name);
        session.save(department);
        tr.commit();
        session.close();
        return department;
    }


    /*
     *   Remove Student
     *  */
    void removeCourse(int id ){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Department department=session.find(Department.class,id);
        session.remove(department);
        tr.commit();
        session.close();
    }
    /*
     *   update Student
     *  */
    void updateCourse(int id ,String name){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Department department=session.find(Department.class,id);
        department.setName(name);
        session.update(department);
        tr.commit();
        session.close();
    }

}