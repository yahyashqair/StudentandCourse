package hiber.test1.hiber;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

public @Data class Course {
    private  Integer cid ;
    private String name ;
    private Set<Student> studentSet =  new HashSet<Student>();
//
//    public Course(int cid, String name, Set<Student> studentSet) {
//        this.cid = cid;
//        this.name = name;
//        this.studentSet = studentSet;
//    }
//
//    @Override
//    public String toString() {
//        return "Course{" +
//                "cid=" + cid +
//                ", name='" + name + '\'' +
//                ", studentSet="  +
//                '}';
//    }
//
//    public Set<Student> getStudentSet() {
//        return studentSet;
//    }
//
//    public void setStudentSet(Set<Student> studentSet) {
//        this.studentSet = studentSet;
//    }
//
//    public Course() {
//    }
//
//    public int getCid() {
//        return cid;
//    }
//
//    public void setCid(int cid) {
//        this.cid = cid;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
