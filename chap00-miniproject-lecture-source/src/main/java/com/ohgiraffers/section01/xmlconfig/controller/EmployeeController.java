package com.ohgiraffers.section01.xmlconfig.controller;


import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;
import com.ohgiraffers.section01.xmlconfig.model.service.EmployeeService;

import com.ohgiraffers.section01.xmlconfig.view.PrintResultMoon;

import java.util.List;

public class EmployeeController {

    private final EmployeeService employeeService;
    private final PrintResultMoon printResultMoon;

    public EmployeeController(){
        this.employeeService = new EmployeeService();
        this.printResultMoon = new PrintResultMoon();
    }


    public void selectAllEmployee() {

        List<EmployeeDTO> employeelist = employeeService.selectAllEmployee();

        if (employeelist != null){
            printResultMoon.printMenuList(employeelist);
        }else{
            printResultMoon.printErrorMessage("selectEmployeeList");
        }

    }
}
