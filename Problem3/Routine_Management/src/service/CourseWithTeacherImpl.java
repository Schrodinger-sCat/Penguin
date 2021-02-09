package service;

import model.Course;
import repository.DataRepository;

public class CourseWithTeacherImpl implements CourseWithTeacher {
    public void courseWithTeacher(DataRepository dataRepository){
        Course[] courseList= dataRepository.getCourseList();

        for(Course course: courseList) System.out.println(course.getName()+", "+course.getTeacher().getName());
    }
}
