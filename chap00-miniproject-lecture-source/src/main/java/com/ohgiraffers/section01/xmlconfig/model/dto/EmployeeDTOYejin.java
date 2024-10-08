package com.ohgiraffers.section01.xmlconfig.model.dto;

public class EmployeeDTOYejin {
    private String empId;
    private String empName;
    private String empNo;
    private Integer salary;
    private Double bonus;

    public EmployeeDTOYejin(){}

    public EmployeeDTOYejin(String empId, String empName, String empNo, Integer salary, Double bonus) {
        this.empId = empId;
        this.empName = empName;
        this.empNo = empNo;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
