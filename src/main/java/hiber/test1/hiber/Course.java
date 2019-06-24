package hiber.test1.hiber;

import java.util.HashSet;

public class Course {
    private  int cid ;
    private String name ;
    private HashSet<Student> studentSet;

    public Course(int cid, String name, HashSet<Student> studentSet) {
        this.cid = cid;
        this.name = name;
        this.studentSet = studentSet;
    }

    public HashSet<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(HashSet<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Course() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
