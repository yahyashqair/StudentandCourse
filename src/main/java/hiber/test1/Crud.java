package hiber.test1;

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

public class Crud {

    static Session makesesstions(){

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

    // For Testing ..
    static void readData() {
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
         Student student=session.get(Student.class,443233);
         student.getDepartment().getId();
        System.out.println( student.getDepartment().getId());
         System.out.println(student.getName());
        tr.commit();
        session.close();
    }

    // For Testing ..
    static void insertData() {


        Session session = makesesstions();
        Transaction tr = session.beginTransaction();

        Student s1 = new Student();
        Department department = new Department();

        department.setName("COMPENG");
        //department.setId(2);
        s1.setName("BL BL");
        s1.setYear(4);
        s1.setDepartment(department);
        //s1.setSid((int) (Math.random() * 500000));
        Student s2 = new Student();
        s2.setName("KL KL ");
        s2.setYear(1);
        s2.setDepartment(department);
        //s2.setSid((int) (Math.random() * 500000));
        //
        // Courses
        Course c1 = new Course();
        c1.setName("COMP311");
        //c1.setCid((int) (Math.random() * 500000));

        Course c2 = new Course();
        c2.setName("COMP344");
        //c2.setCid((int) (Math.random() * 500000));

        Set<Course> courseSet = new HashSet<Course>();
        courseSet.add(c1);
        s1.setCourseSet(courseSet);
        courseSet.add(c2);
        s2.setCourseSet(courseSet);

        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(s1);
        c1.setStudentSet(studentSet);
        studentSet.add(s2);
        c2.setStudentSet(studentSet);
        // end Courses
        department.setStudentSet(studentSet);

        session.save(department);
        session.save(s1);
        session.save(s2);
        session.save(c1);
        session.save(c2);
        tr.commit();
        session.close();
        System.out.println(" Finished ");

    }

    /*
    *   Create Strudent
    *  */
    static Student CreatStudent(String Name,int did ,int year){
        Student student = new Student();
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Department department = session.get(Department.class,did);
        student.setDepartment(department);
        student.setName(Name);
        student.setYear(year);
        session.save(student);
        tr.commit();

        session.close();
        return student;
    }


    /*
     *   Remove Student
     *  */
    static void RemoveStudent(int id ){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Student student=session.find(Student.class,id);
        session.remove(student);
        tr.commit();
        session.close();
    }
    /*
     *   update Student
     *  */
    static void UpdateStudent(int id ,String name){
        Session session = makesesstions();
        Transaction tr = session.beginTransaction();
        Student student=session.find(Student.class,id);
        student.setName(name);
        session.update(student);
        tr.commit();

        session.close();
    }

    public static void main(String[] args) {
        System.out.println("Start");

        // UpdateStudent(443234,"Updated"); // Tested
        // RemoveStudent(443235); // Tested
        //CreatStudent("new",2,6); // Tested
        readData();
    }

}