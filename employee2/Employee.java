package employee2;

import java.util.List;

public class Employee {

    private int employeeId;
    private String name;
    private String email;
    private List<Address> ads;
    private List<Attendance> attend;
    private Salary salary;

    public Employee(int employeeId, String name, String email, List<Address> ads, List<Attendance> attend, Salary salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.ads = ads;
        this.attend = attend;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getAds() {
        return ads;
    }

    public void setAds(List<Address> ads) {
        this.ads = ads;
    }

    public List<Attendance> getAttend() {
        return attend;
    }

    public void setAttend(List<Attendance> attend) {
        this.attend = attend;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ads=" + ads +
                ", attend=" + attend +
                ", salary=" + salary +
                '}';
    }
}
