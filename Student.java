import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private double averageGrade;
    private List<Course> sCourses;

    public Student(String id, String name, String email) {
        super(id, name, email);
        this.sCourses = new ArrayList<>();
        this.averageGrade = 0.0;
    }

    public void registerCourse(Course c) {
        if (!sCourses.contains(c)) {
            sCourses.add(c);
            c.enrollStudent(this); // assuming Course has a method to add student
        } else {
            throw new IllegalArgumentException("Student already registered for this course.");
        }
    }

    public double calculateAverageGrade() {
        // This would need grades. For simplicity, we'll just return current average.
        // In a real system, we'd compute from enrolled courses' grades.
        // We'll implement later with a grade map.
        return averageGrade;
    }

    // setter for averageGrade if needed
    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public List<Course> getCourses() {
        return sCourses;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + (getPhoneNumber() != null ? getPhoneNumber() : "N/A"));
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Courses: ");
        for (Course c : sCourses) {
            System.out.println(" - " + c.getCourseCode() + ": " + c.getCourseName());
        }
    }
}