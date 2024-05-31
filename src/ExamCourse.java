import java.time.LocalDate;

public class ExamCourse extends Course{
    private String examFormat;

    public ExamCourse(String name, String description, LocalDate startDate, int durationInDays, StadyFormat stadyFormat, String examFormat) {
        super(name, description, startDate, durationInDays, stadyFormat);
        this.examFormat = examFormat;
    }
    public void displayExamFormat() {
        System.out.println("Exam Format: " + examFormat);
    }

}
