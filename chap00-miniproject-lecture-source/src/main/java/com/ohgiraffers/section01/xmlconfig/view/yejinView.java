package com.ohgiraffers.section01.xmlconfig.view;

import com.ohgiraffers.section01.xmlconfig.controller.EmployeeControllerYejin;

import java.util.Scanner;

public class yejinView {

    public void yejinMainView(){

        Scanner sc = new Scanner(System.in);
        EmployeeControllerYejin employeeControllerYejin = new EmployeeControllerYejin();

        do {

            System.out.println("===============예진 페이지 입니다================");
            System.out.println("1. 연차별 사원 조회하기");
            System.out.println("2. 신입사원 등록하기");
            System.out.println("3. 선택 사원 급여 조정");
            System.out.println("4. 퇴사시키기");
            System.out.println("99. 이전 메뉴로 돌아가기");

            System.out.print("\n원하는 메뉴 선택하기: ");

            int num = sc.nextInt();

            switch (num){
                case 1:
                    employeeControllerYejin.selectYearEmp(inputSelectInfo());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 99:
                    return;
            }

        } while (true);
    }

    private static String inputSelectInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇년차의 사원을 조회할까요?: ");
        String input = sc.nextLine();

        return input;
    }
    
    

}
