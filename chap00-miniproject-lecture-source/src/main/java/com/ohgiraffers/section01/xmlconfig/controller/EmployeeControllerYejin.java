package com.ohgiraffers.section01.xmlconfig.controller;

import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;
import com.ohgiraffers.section01.xmlconfig.model.service.EmployeeServiceYejin;
import com.ohgiraffers.section01.xmlconfig.view.PrintResultYejin;

import java.util.List;

public class EmployeeControllerYejin {

    private final EmployeeServiceYejin employeeServiceYejin;
    private final PrintResultYejin printResultYejin;

    public EmployeeControllerYejin(){
        employeeServiceYejin = new EmployeeServiceYejin();
        printResultYejin = new PrintResultYejin();
    }

    public void selectYearEmp(String inputInfo){
        int inputYear = Integer.parseInt(inputInfo);

        List<EmployeeDTO> employeeList =  employeeServiceYejin.selectEmployee(inputYear);

        if (employeeList != null){
            printResultYejin.printEmployeeList(employeeList);
        }

    }

}
