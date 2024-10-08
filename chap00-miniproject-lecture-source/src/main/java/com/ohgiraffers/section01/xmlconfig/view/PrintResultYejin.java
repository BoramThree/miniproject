package com.ohgiraffers.section01.xmlconfig.view;

import com.ohgiraffers.section01.xmlconfig.model.dto.EmployeeDTO;

import java.util.List;

public class PrintResultYejin {


    public void printEmployeeList(List<EmployeeDTO> employeeList) {

        System.out.println("요청하신 조회 결과 입니다.");

        for (EmployeeDTO e : employeeList){
            System.out.println(e);
        }

        System.out.println("\n===============================");

    }
}
