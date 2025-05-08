package com.ohgiraffers.practice.classandobject.BookDTO;

public class Application {
    public static void main(String[] args) {

        BookDTO bookDTO = new BookDTO();
        bookDTO.printInformation();

        BookDTO bookDTO2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bookDTO2.printInformation();

        BookDTO bookDTO3 = new BookDTO("자바의 정석", "도우출판", "남궁성", 5000000, 0.5);
        bookDTO3.printInformation();
    }
}
