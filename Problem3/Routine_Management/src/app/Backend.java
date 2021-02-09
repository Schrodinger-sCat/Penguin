package app;

import repository.DataRepository;
import service.Services;

import java.util.Scanner;

public class Backend {
    Services services;
    public Backend(DataRepository dataRepository){
        services=new Services(dataRepository);
    }
    public void runBackend(){
        Scanner sc=new Scanner(System.in);
        try {
            String x = sc.nextLine();
            switch (x) {
                case "A":
                    services.CreateRoutine();
                    break;
                case "B":
                    services.ShowRoutine();
                    break;
                case "C":
                    services.showCourseWithTeacher();
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }catch(Exception e){
            //System.out.println("Invalid Input Format!!");
            e.printStackTrace();
        }
    }
}
