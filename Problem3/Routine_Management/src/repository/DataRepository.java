package repository;

import model.Course;
import model.Day;

public interface DataRepository {
    Day[] getDayList();
    Course[] getCourseList();
    int getTotalDay();
    int getTotalHour();
}
