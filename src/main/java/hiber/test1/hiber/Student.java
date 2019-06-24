package hiber.test1.hiber;

public class Student {
    private int sid ;
    private String name ;
    private int year ;

    public Student() {
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

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }
}
