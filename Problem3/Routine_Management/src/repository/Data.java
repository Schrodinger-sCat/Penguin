package repository;

public class Data {
    private int totalDay=5;
    private int totalHour=4;
    private String[] course={"English Grammar", "Mathematics", "Physics", "Chemistry", "Biology"};
    private String[] teacher={"John Smith", "Lara Gilbert", "Johanna Kabir", "Danniel Robertson", "Larry Cooper"};

    public int getTotalDay() {
        return totalDay;
    }

    public int getTotalHour() {
        return totalHour;
    }

    public String[] getCourse() {
        return course;
    }

    public String[] getTeacher() {
        return teacher;
    }
}
