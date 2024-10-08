package com.ohgiraffers.section01.xmlconfig.view;

import java.util.Scanner;

public class MainView {

    public void display(){

        Scanner sc = new Scanner(System.in);
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

                case 3: JeonghyeonView.moonplay();
                    break;

                case 4:
                    break;
            }

        } while (true);
        
    }

}
