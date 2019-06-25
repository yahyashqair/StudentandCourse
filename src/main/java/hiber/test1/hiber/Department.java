package hiber.test1.hiber;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private int id ;
    private String name ;
    private Set<Student> studentSet = new HashSet<Student>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}