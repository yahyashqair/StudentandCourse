package hiber.test1.hiber;

import java.util.Set;
import java.util.HashSet;

public class Student {


    private Integer sid;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private Department department;
    private String name;
    private int year;
    private Set<Course> courseSet = new HashSet<Course>();
    ;

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }

    public Student() {
        this.sid = null;
    }

    public Student(int sid, String name, int year) {
        this.sid = sid;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }


}
