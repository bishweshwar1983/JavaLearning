import java.util.*;
import java.util.ArrayList;

public class Course {

    private String courseName;
    private String courseCode;

    private List<Student> students = new ArrayList<>();
    private Instructor instructor = new Instructor();

    public void func(){
        System.out.println("test");
    }

    public void getAllStudents(){
        for(Student s: students){
            System.out.print(s.getStudentID() + "  " + s.getGPA() + " " + s.getMajor());
        }
    }

    public Instructor getInstructor(){
        return instructor;
    }

    public void addStudents(Student student){
        students.add(student);
    }

    public void addStudent(ArrayList<Student> students){
        students.addAll(students);
    }

    public void removeStudents(Student student){
        students.remove(student);
    }

    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
