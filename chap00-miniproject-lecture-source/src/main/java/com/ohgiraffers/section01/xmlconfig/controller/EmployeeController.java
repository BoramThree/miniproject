package com.ohgiraffers.section01.xmlconfig.controller;

import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;
import com.ohgiraffers.section01.xmlconfig.model.service.EmployeeService1;
import com.ohgiraffers.section01.xmlconfig.view.PrintResult;

import java.util.List;

public class EmployeeController {


    private final EmployeeService1 employeeService1;
    private final PrintResult printResult;


    public EmployeeController() {
        this.employeeService1 = new EmployeeService1();
        this.printResult = new PrintResult();

    }

    public void selectAllEmployee() {


        List<EmployeeDTO> employeeList =  employeeService1.selectAllEmployee();

        if(employeeList != null) {
            printResult.printEmployeeList(employeeList);
        } else {
            printResult.printErrorMessage("selectList");
        }


    }
}
