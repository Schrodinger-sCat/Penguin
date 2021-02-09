package service;

import model.Course;
import repository.DataRepository;

import java.util.Scanner;

public class Services {
    ShowRoutineService showRoutine;
    CreateRoutineService createRoutine;
    CourseWithTeacher courseWithTeacher;
    DataRepository dataRepository;
    public Services(DataRepository dataRepository){
        showRoutine= new ShowRoutineServiceImpl();
        createRoutine= new CreateRoutineServiceImpl();
        courseWithTeacher= new CourseWithTeacherImpl();
        this.dataRepository=dataRepository;
    }
    public void CreateRoutine(){
        Scanner sc=new Scanner(System.in);
        showCourses(dataRepository);
        System.out.println("Give 4 inputs in 4 line");
        try{
            for(int i=0; i<dataRepository.getTotalHour(); i++){
                String st=sc.nextLine();
                Scanner sc1=new Scanner(st);
                createRoutine.createRoutine(sc1.nextInt(), sc1.nextInt(), sc1.nextInt(), dataRepository);
            }
        }catch(Exception e){
            System.out.println("Invalid Input!! Check your input format.");
        }
    }
    public void ShowRoutine(){
        try{
            showRoutine.showRoutine(dataRepository);
        }catch(Exception e){
            System.out.println("Error in showRoutine!!");
        }
    }
    public void showCourseWithTeacher(){
        try{
            courseWithTeacher.courseWithTeacher(dataRepository);
        }catch(Exception e){
            System.out.println("Error in CourseWithTeacher!!");
        }
    }
    public static void showCourses(DataRepository dataRepository){
        Course[] courseList=dataRepository.getCourseList();
        for(int i=0; i< courseList.length; i++) System.out.println((i+1)+". "+courseList[i].getName());
    }
}
