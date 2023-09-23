public class Instructor extends UniversityMember{

    int employeeID;
    String department;
    int salary;

    @Override
    public int getID(){
        return employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
