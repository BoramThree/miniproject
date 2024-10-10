package com.ohgiraffers.section01.xmlconfig.view;

import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;
import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTOmoon;

import java.util.List;

public class PrintResultMoon {

    public void printMenuList (List<EmployeeDTOmoon> employeeList){

        System.out.println("님이 요청하신 전체메뉴 조회입니다.");

        for (EmployeeDTOmoon menu : employeeList){
            System.out.println(menu);
        }
    }

    public void printErrorMessage(String errorCode){

        String errorMessage = "";

        switch (errorCode){
            case "selectEmployeeList" :
                errorMessage = "메뉴 조회를 실패하셨습니다.";
                break;
        }

    }

}
