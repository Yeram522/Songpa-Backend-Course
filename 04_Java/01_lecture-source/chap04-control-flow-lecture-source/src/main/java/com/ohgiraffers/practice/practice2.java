package com.ohgiraffers.practice;

import javax.smartcardio.ATR;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        //1.
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);

        // 2.
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합 : " + sum);

        System.out.println();

        // 3.
        for(int i = 1; i < 10; i++){
            System.out.println("7 * " + i + " = " + (7*i));
        }


        // 4.
        System.out.print("정수를 입력하세요 : ");
        num = sc.nextInt();
        sum = 0;
        for(int i = 1; i <= num ; i++){
            sum += (i%2 == 0)? i : 0;
        }
        System.out.println("1부터 " + num + "까지 짝수의 합 : " + sum);


        // 5.
        System.out.print("문자열을 입력하세요 : ");
        String word = sc.nextLine();
        for(int i = 0; i < word.length(); i++){
            System.out.println(i + " : " + word.charAt(i));
        }
        System.out.println();

        // 6.

        for(int i = 97; i < 123; i++){
            System.out.print((char)i);
        }

        System.out.println();
        
        // 7.
        System.out.println("정수를 입력하세요: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                System.out.print("마");
            }else{
                System.out.print("토");
            }
        }

        System.out.println();
        
        // 8.
        sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        num = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();
        practice2 pc = new practice2();
        pc.calculate(num,num2,'+');
        pc.calculate(num,num2,'-');
        pc.calculate(num,num2,'*');
        pc.calculate(num,num2,'/');
        pc.calculate(num,num2,'%');

        System.out.println();

    }

    public void calculate(int a, int b, char operate){
        if(b == 0 && (operate == '/' || operate == '%')){
            System.out.printf("0으로 나눌 수 없습니다");
            return;
        }
        String soper = "";
        int result = 0;
        switch (operate){
            case '+':
                soper = "더하기 결과";
                result = a + b;
                break;
            case '-':
                soper = "빼기 결과";
                result = a - b;
                break;
            case '*':
                soper = "곱하기 결과";
                result = a * b;
                break;
            case '/':
                soper = "나누기한 몫";
                result = a / b;
                break;
            case '%':
                soper = "나누기한 나머지";
                result = a % b;
                break;
        }
        System.out.println(soper + " : " + result);
        return;
    }
}
