package org.example.method;

public class Student {
    private String name;
    private int id;
    private String course;


    public Student() {
    }

    public Student(int id,String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {return "Id:"+id+",name:"+name+",course:"+course;}

}
