public class Routine {
    private Day[] dayList;
    private Course[] courses;
    int totalDay;
    int totalHour;
    public Routine(int totalDay, int totalHour, Course[] courses){
        dayList=new Day[totalDay];
        this.totalHour=totalHour;
        this.totalDay=totalDay;
        this.courses=courses;
        for(int i=0; i<totalDay; i++) dayList[i]= new Day(totalHour);
    }
    public void createRoutine(int dayIndex, int hourIndex, int courseIndex){
        dayList[dayIndex].setCourse(hourIndex, courses[courseIndex]);
    }
    public void showRoutine(){
        for(int i=0; i<totalDay; i++){
            if(dayList[i]!=null){
                //System.out.println("I'm here");
                for(int j=0; j<totalHour; j++){
                    Course c=dayList[i].getCourse(j);
                    if(c!=null) System.out.println(i+" "+j+" "+dayList[i].getCourse(j).getName());
                }
            }
        }
    }
    public void courseWithTeacher(){
        for(Course course: courses) System.out.println(course.getName()+", "+course.getTeacher().getName());
    }
}
