public class Student extends UniversityMember{
    int studentID;
    String major;
    double GPA;

    @Override
    public int getID(){
        return studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getMajor() {
        return major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
