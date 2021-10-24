package com.example.springdemo.Model;

import java.util.ArrayList;
import java.util.List;

public class Department  {
    private int deptId;
    private String deptName;

    public Department (int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    List<Department> dept = new ArrayList<>();
    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


}
