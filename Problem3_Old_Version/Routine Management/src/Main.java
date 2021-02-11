import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int totalDay=5;
        int totalHour=4;
        String[] course={"English Grammar", "Mathematics", "Physics", "Chemistry", "Biology"};
        String[] teacher={"John Smith", "Lara Gilbert", "Johanna Kabir", "Danniel Robertson", "Larry Cooper"};
        Course[] courses= new Course[course.length];
        for(int i=0; i<courses.length; i++){
            courses[i]=new Course(course[i], new Teacher(teacher[i]));
        }
        Routine routine=new Routine(totalDay, totalHour, courses);
        while(true){
            System.out.println("A. Create Routine\nB. Show Routine\nC. List Courses with Teachers Name");
            System.out.println("Select an option with mentioned value:");
            try{
                String x=sc.nextLine();
                switch(x){
                    case "A":
                        for(int i=0; i< courses.length; i++) System.out.println((i+1)+". "+course[i]);
                        System.out.println("Give input 4 input in 4 line");
                        for(int i=0; i<totalHour; i++){
                            String st=sc.nextLine();
                            Scanner sc1=new Scanner(st);
                            routine.createRoutine(sc1.nextInt(), sc1.nextInt(), sc1.nextInt());
                        }
                        break;
                    case "B":
                        routine.showRoutine();
                        break;
                    case "C":
                        routine.courseWithTeacher();
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;
                }

            }catch (Exception e){
                //System.out.println("Invalid Input!!");
                e.printStackTrace();
            }
            System.out.println();
            clearConsole();
        }
    }
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}
