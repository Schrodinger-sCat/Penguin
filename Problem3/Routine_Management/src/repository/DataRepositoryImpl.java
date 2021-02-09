package repository;

import model.Course;
import model.Day;
import model.Teacher;

public class DataRepositoryImpl implements DataRepository{
    private Day[] dayList;
    private Course[] courseList;
    Data data;
    public DataRepositoryImpl(Data data){
        this.data=data;
        String[] courses= data.getCourse();
        String[] teachers= data.getTeacher();
        courseList=new Course[courses.length];
        dayList=new Day[data.getTotalDay()];
        for(int i=0; i<courses.length; i++){
            courseList[i]=new Course(courses[i], new Teacher(teachers[i]));
        }
        for(int i=0; i< data.getTotalDay(); i++) dayList[i]= new Day(data.getTotalHour());
    }

    public Day[] getDayList() {
        return dayList;
    }

    public Course[] getCourseList() {
        return courseList;
    }

    public int getTotalDay() {
        return data.getTotalDay();
    }

    public int getTotalHour() {
        return data.getTotalHour();
    }
}
