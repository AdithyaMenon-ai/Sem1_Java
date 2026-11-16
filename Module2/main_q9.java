import java.util.Scanner;

class Course {
    private String courseName;
    private String duration;

    public Course() {
    }

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }
}

class Student {
    private String name;
    private Course enrolledCourse;

    public Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name +
               " Course: " + enrolledCourse.getCourseName() +
               " (" + enrolledCourse.getDuration() + ")";
    }
}

class PremiumStudent extends Student {
    private int discount;

    public PremiumStudent(String name, Course enrolledCourse, int discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Premium Student: " +
               getName() +
               " Course: " +
               getCourse().getCourseName() +
               " (" + getCourse().getDuration() +
               ") Discount: " + discount + "%";
    }

    private String getName() {
        return super.toString()
                .substring(9, super.toString().indexOf(" Course:"));
    }

    private Course getCourse() {
        // This method is replaced by accessible information through
        // the parent class in a cleaner implementation.
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Course
        String[] courseData = sc.nextLine().split(",");

        Course course = new Course(
                courseData[0].trim(),
                courseData[1].trim()
        );

        // Normal student
        String[] studentData = sc.nextLine().split(",");

        Student student = new Student(
                studentData[0].trim(),
                course
        );

        // Premium student
        String[] premiumData = sc.nextLine().split(",");

        PremiumStudent premiumStudent = new PremiumStudent(
                premiumData[0].trim(),
                course,
                Integer.parseInt(premiumData[2].trim())
        );

        System.out.println(student);
        System.out.println(premiumStudent);

        sc.close();
    }
}
