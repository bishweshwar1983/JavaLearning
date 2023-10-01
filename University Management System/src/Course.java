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
//            System.out.println(s.getStudentID() + "  " + s.getGPA() + " " + s.getMajor());
            System.out.println(s.getStudentID() + "  " + s.getGPA() + " " + s.getMajor());
     }

    }

    public List<Student> getAllStudentsList(){
        return students;
    }

    public Instructor getInstructor(){
        return instructor;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void addStudents(ArrayList<Student> students){
        this.students.addAll(students);
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