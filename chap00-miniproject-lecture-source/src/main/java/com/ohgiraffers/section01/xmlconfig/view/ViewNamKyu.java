package com.ohgiraffers.section01.xmlconfig.view;
import com.ohgiraffers.section01.xmlconfig.controller.EmployeeControllerNamKyu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ViewNamKyu {

    public void display(){

        Scanner sc = new Scanner(System.in);
        EmployeeControllerNamKyu controllerNamKyu = new EmployeeControllerNamKyu();


        do {
            System.out.println("==========Employee 메뉴 관리 시스템============");
            System.out.println("메뉴전체 조회하기");
            System.out.println("============================================");
            System.out.println("실행할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    controllerNamKyu.selectAllEmployee();
                    break;

            }

        }while (true);

    }

    private static Map<String,String> inputEmpId(){
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 아이디 넘버를 입력하세요 : ");
        String empId = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("empId",empId);
        return parameter;
    }





}
