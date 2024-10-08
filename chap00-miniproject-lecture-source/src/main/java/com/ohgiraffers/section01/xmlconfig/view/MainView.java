package com.ohgiraffers.section01.xmlconfig.view;

import com.ohgiraffers.section01.xmlconfig.controller.EmployeeController;

import java.util.Scanner;

public class MainView {

    public void display(){

        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();

        yejinView yejin = new yejinView();
        
        do {

            System.out.println("===================페이지 연결==================");
            System.out.println("1. 남규님 페이지");
            System.out.println("2. 예진님 페이지");
            System.out.println("3. 정현님 페이지");
            System.out.println("4. 경훈님 페이지");

            System.out.print("\n접속하실 페이지를 골라주세요: ");

            int num = sc.nextInt();

            switch (num){
                case 1:
                    break;

                case 2:
                    yejin.yejinMainView();
                    break;

                case 3:
                    break;

                case 4: employeeController.selectAllEmployee();
                    break;
            }

        } while (true);
        
    }

}
