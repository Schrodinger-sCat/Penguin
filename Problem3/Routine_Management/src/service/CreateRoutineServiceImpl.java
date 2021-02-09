package service;

import model.Course;
import model.Day;
import repository.DataRepository;

public class CreateRoutineServiceImpl implements CreateRoutineService {
    public void createRoutine(int dayIndex, int hourIndex, int courseIndex, DataRepository dataRepository){
        Day[] dayList= dataRepository.getDayList();
        Course[] courseList= dataRepository.getCourseList();
        dayList[dayIndex].setCourse(hourIndex, courseList[courseIndex]);
    }
}
