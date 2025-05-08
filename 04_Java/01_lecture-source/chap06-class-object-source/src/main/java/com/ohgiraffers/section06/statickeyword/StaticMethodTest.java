package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {
    private int count;

    public void nonStaticMethod(){
        this.count ++;

        System.out.println("nonStaticMethod 호출됨...");
    }

    public static void staticMethod(){
//        this.count ++ ; // 인스턴스를 만들고 사용하는 메소드가 아니기 때문에 this는 사용할 수 없다.

        System.out.println("staticMethod 호출됨...");

    }


}
