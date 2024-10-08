package com.ohgiraffers.section01.xmlconfig.model.dto;

public class EmployeeDTONamKyu {
    private int emp_ID;
    private String emp_Name;
    private int emp_No;
    private String email;
    private int phone;
    private String dept_Code;
    private String job_Code;
    private String sal_Level;
    private int salary;
    private int bonus;
    private int manager_Id;
    private int hire_Date;
    private int ent_Date;
    private String ent_Yn;


    public int getEmp_ID() {
        return emp_ID;
    }

    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public int getEmp_No() {
        return emp_No;
    }

    public void setEmp_No(int emp_No) {
        this.emp_No = emp_No;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDept_Code() {
        return dept_Code;
    }

    public void setDept_Code(String dept_Code) {
        this.dept_Code = dept_Code;
    }

    public String getJob_Code() {
        return job_Code;
    }

    public void setJob_Code(String job_Code) {
        this.job_Code = job_Code;
    }

    public String getSal_Level() {
        return sal_Level;
    }

    public void setSal_Level(String sal_Level) {
        this.sal_Level = sal_Level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getManager_Id() {
        return manager_Id;
    }

    public void setManager_Id(int manager_Id) {
        this.manager_Id = manager_Id;
    }

    public int getHire_Date() {
        return hire_Date;
    }

    public void setHire_Date(int hire_Date) {
        this.hire_Date = hire_Date;
    }

    public int getEnt_Date() {
        return ent_Date;
    }

    public void setEnt_Date(int ent_Date) {
        this.ent_Date = ent_Date;
    }

    public String getEnt_Yn() {
        return ent_Yn;
    }

    public void setEnt_Yn(String ent_Yn) {
        this.ent_Yn = ent_Yn;
    }


    @Override
    public String toString() {
        return "EmployeeDTONamKyu{" +
                "emp_ID=" + emp_ID +
                ", emp_Name='" + emp_Name + '\'' +
                ", emp_No=" + emp_No +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", dept_Code='" + dept_Code + '\'' +
                ", job_Code='" + job_Code + '\'' +
                ", sal_Level='" + sal_Level + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", manager_Id=" + manager_Id +
                ", hire_Date=" + hire_Date +
                ", ent_Date=" + ent_Date +
                ", ent_Yn='" + ent_Yn + '\'' +
                '}';
    }
}
