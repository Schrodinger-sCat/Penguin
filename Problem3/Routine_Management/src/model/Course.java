package model;

public class Course {
    private String name;
    private Teacher teacher;
    public Course(String name, Teacher teacher){
        this.name=name;
        this.teacher=teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
