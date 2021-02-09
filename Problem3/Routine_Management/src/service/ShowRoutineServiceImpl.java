package service;

import model.Course;
import model.Day;
import repository.DataRepository;

public class ShowRoutineServiceImpl implements ShowRoutineService{
    public void showRoutine(DataRepository dataRepository){
        Day[] dayList= dataRepository.getDayList();
        Course[] courses= dataRepository.getCourseList();
        for(int i=0; i< dayList.length; i++){
            if(dayList[i]!=null){
                //System.out.println("I'm here");
                for(int j=0; j<dayList[i].getTotalHour(); j++){
                    Course c=dayList[i].getCourse(j);
                    if(c!=null) System.out.println(i+" "+j+" "+dayList[i].getCourse(j).getName());
                }
            }
        }
    }
}
