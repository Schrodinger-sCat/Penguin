package app;

public class UI {
    private String[] options={"A. Create Routine", "B. Show Routine", "C. List Courses with Teachers Name"};
    public void showOptions(){
        for(String option:options) System.out.println(option);
        System.out.println();
    }
}
