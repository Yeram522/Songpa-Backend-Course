package com.ohgiraffers.practice.homecat;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("╱◥▦◣\n" +
                "│田│田│\\\n");
        /* 프로그램 개요
        *  집사가 길냥이를 키우는 프로그램
        *
        *  시스템 요구사항
        * 1. 집사는 고양이에게 츄르 주기, 사료 주기, 놀아주기, 씻기기, 꼬리만지기 를 할 수 있다.
        * 2. 고양이는 츄르 먹기, 사료 먹기, 놀기, 씻을 때 화내기?를 할 수 있다.
        * 3. 츄르,사료를 먹거나 놀아주면 기분지수가 증가하고, 씻거나 꼬리를 만지면 기분지수가 감소한다.
        * 3. 집사는 츄르를 5개 갖고 있고, 츄르가 동나면 사러나가야한다. 사료 또한 마찬가지이다.
        * 4. 츄르와 사료가 없다면 집사는 고양이에게 츄르와 사료를 줄 수 없다.
        * 5. 고양이의 기분이 나빠져서 기분지수가 음수가되면 고양이는 집을 나가버린다.
        * 6. 고양이의 기분지수가 50이하라면 고양이를 씻길 수 없다.
        * 7. 기분지수가 100이 되면 시스템은 종료하고 고양이는 당신을 좋아합니다로 마무리..
        * */

        /* 프로그램 설계하기
        * 1. 필요한 객체 도출
        * - 플레이어(사용자), 집사, 고양이
        *
        * 2. 객체간 상호작용
        * - 집사가 수신할 수 있는 메세지
        * 1. 츄르를 고양이에게 주기
        * 2. 사료를 고양이에게 주기
        * 3. 고양이 놀아주기
        * 4. 고양이 씻기기
        * 5. 고양이 꼬리 만지기
        * 6. 마트 다녀오기
        *
        * - 고양이가 수신할 수 있는 메세지
        * 1. 츄르 먹고 기분지수 20 상승
        * 2. 밥 먹구 기분지수 10 상승
        * 3. 놀고 기분지수 15 상승
        * 4. 씻김 당하고 기분지수 -20하락
        * 5. 꼬리만집 당하고 기분지수 -10 하락
        * 6. 집사가 마트가면 기분지수 -5 하락
        * */

        CatParent catParent = new CatParent();

        Scanner sc = new Scanner(System.in);

        while (catParent.checkCatEmo()){
            System.out.println("========== 길냥이 키우기 프로그램 ==========");
            System.out.println("1. 츄르 주기");
            System.out.println("2. 밥 주기");
            System.out.println("3. 샤워 시키기");
            System.out.println("4. 놀아주기");
            System.out.println("5. 꼬리 만지기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 :");
            int no = sc.nextInt();


            switch (no){
                case 1: catParent.giveChurr(); break;
                case 2: catParent.giveFood();break;
                case 3: catParent.showerCat(); break;
                case 4: catParent.playCat(); break;
                case 5: catParent.touchCatTail(); break;
                case 6: catParent.goMart(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다. "); break;
            }

            if(no == 9){
                break;
            }

        }

    }
}
