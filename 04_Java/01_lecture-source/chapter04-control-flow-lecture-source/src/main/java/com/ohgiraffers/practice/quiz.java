package com.ohgiraffers.practice;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {

        boolean trigger = true;

        while(trigger){
            Scanner sc = new Scanner(System.in);
            System.out.print("등록할 학생의 이름을 입력해주세요(0을 입력하면 종료합니다)");
            String name = sc.nextLine();

            if(name.charAt(0) == '0'){
                System.out.println("프로그램을 종료합니다.");
                trigger = false;
            }
            else{
                System.out.println("등록한 학생의 이름은 " + name + " 입니다.");
            }

        }
    }
}
