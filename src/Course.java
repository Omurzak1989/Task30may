import java.time.LocalDate;

public abstract class Course {
    private String name;
    private String description;
    private LocalDate startDate;
    private int durationInDays;
    private StadyFormat stadyFormat;

    public Course(String name, String description, LocalDate startDate, int durationInDays, StadyFormat stadyFormat) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.durationInDays = durationInDays;
        this.stadyFormat = stadyFormat;
    }
    public void displayInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Start Date: " + startDate);
        System.out.println("Duration (in days): " + durationInDays);
        System.out.println("Study Format: " + stadyFormat);
    }

}
