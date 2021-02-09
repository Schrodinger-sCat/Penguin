package model;

public class Day {
    private Course[] courseList;
    public Day(int totalHour){
        courseList=new Course[totalHour];
    }
    public void setCourse(int index, Course course){
        courseList[index]=course;
    }
    public Course getCourse(int index){
        return courseList[index];
    }
    public int getTotalHour(){
        return courseList.length;
    }
}
