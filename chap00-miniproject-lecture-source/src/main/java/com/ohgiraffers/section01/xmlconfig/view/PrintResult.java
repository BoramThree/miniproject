package com.ohgiraffers.section01.xmlconfig.view;

import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;

import java.util.List;

public class PrintResult {

    public void printEmployeeList(List<EmployeeDTO> employeeList) {
        System.out.println("요청하신 전체 조회 결과 입니다.");

        for (EmployeeDTO employee : employeeList) {
            System.out.println(employee);
        }

        System.out.println("==============================================");
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "selectList":
                errorMessage = "메뉴 전체 조회에 실패하셨습니다...";
                break;

        }
        System.out.println(errorMessage);

    }
}
