package com.ohgiraffers.section01.xmlconfig.controller;


import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTONamKyu;
import com.ohgiraffers.section01.xmlconfig.model.service.EmployeeServiceNamKyu;
import java.util.List;

public class EmployeeControllerNamKyu {

  private EmployeeServiceNamKyu employeeServiceNamKyu;



    public void EmployeeControllerNamKyu() {

        this.employeeServiceNamKyu = new EmployeeServiceNamKyu();
    }


    public void selectAllEmployee() {
        List<EmployeeDTONamKyu> empList = employeeServiceNamKyu.selectAllEmployee();
    }
}

