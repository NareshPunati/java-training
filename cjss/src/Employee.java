import java.util.List;

public class Employee {

    private String employeeId;
    private String employeeName;
    private Float Salary;
    private Department dept;
    private location loc;
    private Benefits bn;

    public Employee(String employeeId, String employeeName, Float Salary, Department dept,
                    location loc,Benefits bn) {

         this.employeeId = employeeId;
         this.employeeName = employeeName;
         this.Salary = Salary;
         this.dept = dept;
         this.loc = loc;
         this.bn = bn;
    }

    public Benefits getBn() {
        return bn;
    }

    public void setBn(Benefits bn) {
        this.bn = bn;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public location getLoc() {
        return loc;
    }

    public void setLoc(location loc) {
        this.loc = loc;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Float getSalary() {
        return Salary;
    }

    public void setSalary(Float salary) {
        Salary = salary;
    }
}
