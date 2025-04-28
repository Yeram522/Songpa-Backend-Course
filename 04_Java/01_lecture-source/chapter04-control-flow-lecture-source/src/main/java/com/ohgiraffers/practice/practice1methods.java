package com.ohgiraffers.practice;

import java.util.Scanner;

public class practice1methods {

    public void problem1(){
        int num1 = 20;
        int num2 = 30;
        System.out.println("num1 : " + num1  + " num2 : " + num2);
        System.out.println("더하기 결과 :" + (num1 + num2));
        System.out.println("빼기 결과 :" + (num1 - num2));
        System.out.println("곱하기 결과 :" + (num1 * num2));
        System.out.println("나누기한 몫 :" + (int)(num1 / num2));
        System.out.println("나누기한 나머지 :" + (num1 % num2));
    }

    public void problem2(){
        double width = 12.5;
        double height = 36.4;
        System.out.println("width : " + width  + " height : " + height);
        System.out.println("면적 : " + (width * height));
        System.out.println("둘레 : " + ((width +height)*2));
    }

    public void problem3(){
        double korea = 80.5;
        double math = 50.6;
        double english = 70.8;
        System.out.println("korea : " + korea  + " math : " + math+ " english : " + english);
        System.out.println("총점 : " + (int)(korea + math + english));
        System.out.println("평균 : " + (int)((korea + math + english)/3));

    }

    public void problem4(){
        int a = 10;
        int b = 20;
        System.out.println("a : " + a  + " b : " + b);
        System.out.println("두 수 중 큰 수는" + ((a > b) ? a:b) + "입니다.");
    }

    public  void problem5(int score){
        if(score >= 60){
            System.out.println("합격입니다~~!!!");
        }else{
            System.out.println("아쉽지만 불합격입니다...");
        }
    }

    public void problem6(int number){

        System.out.println("입력하신 수는 " + (number % 2 == 0 ? "짝수입니다." : "홀수입니다."));
    }

    public void problem7(int month, int day){
        System.out.println("month : " + month  + " day : " + day);

        String gift = "";

        if((month >= 1 && month <= 6) && (day >= 1 && day <= 15)){
            gift = "배민 쿠폰";
        } else if((month >= 7 && month <= 12) && (day >= 16 && day <= 31)){
            gift = "스타벅스 커피";
        }else{
            gift = "사탕";
        }

        System.out.println("김예람의 선물은 " + gift + " 입니다.");
    }

    public void problem8(){
        Scanner sc = new Scanner(System.in);

        System.out.print("성인이십니까?");
        int age = sc.nextInt();

        if(age >= 20){
            System.out.println("판매 가능합니다.");
        }
        else{
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
        }
    }

    public void problem9(){
        Scanner sc = new Scanner(System.in);

        System.out.print("당첨 번호가 어떻게 되세요?");
        int age = sc.nextInt();

        if(age < 1 || age > 10){
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
            return;
        }

        if(age % 2 == 0){
            System.out.println("짝수네요, 모자 선물입니다!");
        }
        else{
            System.out.println("홀수네요, 인형 선물입니다!");
        }
    }

    public void problem10(){
        Scanner sc = new Scanner(System.in);
        System.out.print("성실 점수 :");
        int sinserity = sc.nextInt();
        System.out.print("서비스 점수 :");
        int service = sc.nextInt();
        System.out.print("미소 점수 :");
        int smile = sc.nextInt();
        
        int average = (sinserity + service + smile)/3;
        if(average >= 60 && sinserity >= 40 && service >= 40 && smile >= 40){
            System.out.println("합격입니다!");
        }else{
            if(average < 60){
                System.out.println("평균 점수 미달로 불합격입니다.");
            }
            if(sinserity < 40){
                System.out.println("성실 점수 미달로 불합격입니다.");
            }
            if(service < 40){
                System.out.println("서비스 점수 미달로 불합격입니다.");
            }
            if(smile < 40){
                System.out.println("미소 점수 미달로 불합격입니다.");
            }
        }
    }

    public void problem11(){
        Scanner sc = new Scanner(System.in);
        System.out.print("월 급여 입력");
        int monthSalary = sc.nextInt();
        System.out.print("매출액 입력");
        int sales = sc.nextInt();

        // 보너스 계산
        int bonus = 0;
        if(sales >= 50000000) {
            bonus = 5;
        }else if(sales >= 30000000){
            bonus = 3;
        }else if(sales >= 10000000){
            bonus = 1;
        }

        // 출력
        int totalbonus = (int)(sales * ((double)bonus/100));
        System.out.println("======================");
        System.out.println("매출액 : " + sales);
        System.out.println("보너스율 : " + bonus + "%");
        System.out.println("월 급여 : " + monthSalary);
        System.out.println("보너스 금액 : " + totalbonus);
        System.out.println("======================");
        System.out.println("총 급여 : " + (monthSalary + totalbonus));

    }
}
