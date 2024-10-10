package com.ohgiraffers.section01.xmlconfig.controller;

import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;
import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTOmoon;
import com.ohgiraffers.section01.xmlconfig.model.service.EmployeeService11;
import com.ohgiraffers.section01.xmlconfig.view.PrintResultMoon;

import java.util.List;

public class EmployeeMoonController {

    private final EmployeeService11 employeeService;
    private final PrintResultMoon printResultMoon;

    public EmployeeMoonController(){
        this.employeeService = new EmployeeService11();
        this.printResultMoon = new PrintResultMoon();
    }


    public void selectAllEmployee() {

        List<EmployeeDTOmoon> employeelist = employeeService.selectAllEmployee();

        if (employeelist != null){
            printResultMoon.printMenuList(employeelist);
        }else{
            printResultMoon.printErrorMessage("selectEmployeeList");
        }

    }
}
