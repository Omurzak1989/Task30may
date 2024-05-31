import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        StadyFormat format = StadyFormat.ONLINE;


        Course course = new ExamCourse("Java Programming", "Learn Java programming language", LocalDate.of(2024, 6, 1), 30, format, "Online Exam");


        course.displayInfo();
    }

}
