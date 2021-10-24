package com.example.springdemo.Model;

public class Employee1 {
    private int employeeId;
    private String employeeName;
    private Float Salary;
    private Department dept;
    private Location loc;
    private Benefits bn;

    public Employee1(int employeeId, String employeeName, Float salary, Department dept, Location loc,
                     Benefits bn) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        Salary = salary;
        this.dept = dept;
        this.loc = loc;
        this.bn = bn;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
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

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public Benefits getBn() {
        return bn;
    }

    public void setBn(Benefits bn) {
        this.bn = bn;
    }
}
