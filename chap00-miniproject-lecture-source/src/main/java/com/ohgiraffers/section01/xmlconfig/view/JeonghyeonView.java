package com.ohgiraffers.section01.xmlconfig.view;

import com.ohgiraffers.section01.xmlconfig.controller.EmployeeController;

import java.util.Scanner;

public class JeonghyeonView {

    public static void moonplay(){
        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();

        do {
            System.out.println("======================moon 메뉴 관리 시스템=============================");
            System.out.println("1. 메뉴 전체 조회하기");
            System.out.println("2. 신규 메뉴 등록하기");
            System.out.println("=========================================================================");
            System.out.print("실행할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();
            //

        switch (no){
            case 1:
                employeeController.selectAllEmployee();
                break;

        }


        }while (true);





    }
}
