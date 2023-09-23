import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        Instructor i1 = new Instructor();
        Instructor i2 = new Instructor();

        s1.setStudentID(100);
        s1.name = "Student1";
        s1.setGPA(7.0);
        s1.setMajor("Physics");

        s2.setStudentID(101);
        s2.name = "Student2";
        s2.setGPA(8.0);
        s2.setMajor("Chemistry");

        i1.setDepartment("Physics");
        i1.name = "Instructor1";
        i1.setSalary(100000);
        i1.setEmployeeID(200);

        i2.setDepartment("Chemistry");
        i2.name = "Instructor2";
        i2.setSalary(200000);
        i2.setEmployeeID(201);

        ArrayList<UniversityMember> um = new ArrayList<>();
        um.add(s1);
        um.add(s2);
        um.add(i1);
        um.add(i2);

        for(UniversityMember u: um){
            System.out.println(u.getName());
        }


        }
    }
