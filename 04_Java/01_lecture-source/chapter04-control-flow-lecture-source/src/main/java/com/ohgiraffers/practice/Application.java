package com.ohgiraffers.practice;

public class Application {
    public static void main(String[] args) {

        // method practice (1)
        Calculator calc = new Calculator();

        calc.checkMethod();

        System.out.println("1부터 10까지의 합 : "  + calc.sum1to10());

        calc.checkMaxNumber(10,20);

        System.out.println("10과 20의 합은 : " + calc.sumTwoNumber(10,20));

        System.out.println("10과 5의 차는 : " + calc.minusTwoNumber(10,5));



        // method practice (2)
        SimpleOperations soper = new SimpleOperations();

        soper.printMessage();

        System.out.println("1부터 10까지 숫자들의 합은 : " + soper.sumNumbers(1, 10));

        System.out.println("10은 " + (soper.isEvenNumber(10) ? "짝수" : "홀수") +"입니다.");

        System.out.println("\"Hello World\"에서 'o'의 개수는 : " + soper.countCharacter("Hello World",'o'));

        System.out.println("\"Hello World\"를 뒤집은 결과는 : " + soper.reverseString("Hello World"));



    }
}
