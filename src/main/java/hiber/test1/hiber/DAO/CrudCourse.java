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
public class CrudCourse {

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
    Course creatCourse(String Name){
        Course course = new Course();
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        course.setName(Name);
        session.save(course);
        tr.commit();
        session.close();
        return course;
    }


    /*
     *   Remove Student
     *  */
    void removeCourse(int id ){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Course course=session.find(Course.class,id);
        session.remove(course);
        tr.commit();
        session.close();
    }
    /*
     *   update Student
     *  */
    void updateCourse(int id ,String name){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Course course=session.find(Course.class,id);
        course.setName(name);
        session.update(course);
        tr.commit();
        session.close();
    }

}