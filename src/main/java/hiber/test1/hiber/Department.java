package hiber.test1.hiber;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

public @Data class Department {
    private Integer id ;
    private String name ;
    private Set<Student> studentSet = new HashSet<Student>();
//
//    public int getId() {
//        return id;
//    }
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ","+
//                '}';
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Set<Student> getStudentSet() {
//        return studentSet;
//    }
//
//    public void setStudentSet(Set<Student> studentSet) {
//        this.studentSet = studentSet;
//    }

}
