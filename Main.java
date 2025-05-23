
class Course {
    protected int courseID;
    protected String courseTitle;
    protected int creditHours;

    public Course(int courseID, String courseTitle, int creditHours) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

    public void showCourseDetails() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Credit Hours: " + creditHours);
    }
}
class OnlineCourse extends Course {
    private String platformName;
    private String instructor;
    private int durationWeeks;

    public OnlineCourse(int courseID, String courseTitle, int creditHours, String platformName, String instructor, int durationWeeks) {
        super(courseID, courseTitle, creditHours);
        this.platformName = platformName;
        this.instructor = instructor;
        this.durationWeeks = durationWeeks;
    }

    @Override
    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Platform: " + platformName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration (Weeks): " + durationWeeks);
    }
}
class OnsiteCourse extends Course {
    private String location;
    private String classroomNumber;
    private String instructor;

    public OnsiteCourse(int courseID, String courseTitle, int creditHours, String location, String classroomNumber, String instructor) {
        super(courseID, courseTitle, creditHours);
        this.location = location;
        this.classroomNumber = classroomNumber;
        this.instructor = instructor;
    }

    @Override
    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Location: " + location);
        System.out.println("Classroom Number: " + classroomNumber);
        System.out.println("Instructor: " + instructor);
    }
}

class Feedback {
    public void submitFeedback(String comments) {
        System.out.println("Feedback (Comment): " + comments);
    }
    public void submitFeedback(int rating) {
        System.out.println("Feedback (Rating): " + rating + "/5");
    }
    public void submitFeedback(String comments, int rating) {
        System.out.println("Feedback (Comment): " + comments);
        System.out.println("Feedback (Rating): " + rating + "/5");
    }
}


public class Main {
    public static void main(String[] args) {
        Course online = new OnlineCourse(201, "Java Programming", 4, "Coursera", "Sir Ahmed", 12);
        Course onsite = new OnsiteCourse(202, "Data Structures", 4, "Campus A", "Room 218", "Sir Raza");

        System.out.println("Online Course Details ");
        online.showCourseDetails();

        System.out.println("\n Onsite Course Details ");
        onsite.showCourseDetails();


        Feedback feedback = new Feedback();
        System.out.println("\n Feedback Examples ");
        feedback.submitFeedback("Great course!");
        feedback.submitFeedback(4);
        feedback.submitFeedback("Well structured and engaging", 5);
    }
}
