package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {

        /* comment. 논리연산자의 우선순위에 대해 이해하고 활용할 수 있다. */
        /* 논리 연산자의 우선순위와 활용
        * && : 11순위
        * || : 12순위
        * */

        /* 1. 1부터 100 사이의 값인지 확인 */
        /* 1 <= 변수 <= 100 이렇게 사용 못함 --> 변수 => 1 && 변수 <= 100 이렇게 사용해야한다. */
        int num1 = 55;
        System.out.println(num1 >= 1 && num1 <=100 );

        int num2 = 166;
        System.out.println(num2 >= 1 && num2 <=100 );

        /* 2. 영어 대문자인지 확인 */
        char ch1 = 'G';
        System.out.println(ch1 >= 'A' && ch1 <= 'Z');

        char ch2 = 'g';
        System.out.println(ch2 >= 'A' && ch2 <= 'Z');

        /* 3. 대소문자 상관없이 영문자 y인지 확인 */
        char ch3 = 'Y';
        System.out.println(ch3 == 'y' || ch3 == 'Y');

        /* 4. 영문자인지 확인 */
        char ch5 = 'f';
        char ch6 = 'F';
        System.out.println((ch5 >= 65  && ch5 <= 90) || (ch5 >= 97  && ch5 <= 122) );
        System.out.println((ch6 >= 65  && ch6 <= 90) || (ch6 >= 97  && ch6 <= 122) );


        int num = 1;
        System.out.println((num >= 65  && num <= 90) || (num >= 97  && num <= 122) );
    }
}
