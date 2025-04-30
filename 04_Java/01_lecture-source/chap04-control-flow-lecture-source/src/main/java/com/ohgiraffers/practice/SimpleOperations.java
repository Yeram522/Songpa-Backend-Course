package com.ohgiraffers.practice;

public class SimpleOperations {

    public void printMessage(){
        System.out.println("메세지 호출 확인");
    }

    public int sumNumbers(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i ++){
            sum += i;
        }
        return sum;
    }

    public boolean isEvenNumber(int num){
        return (num % 2 == 0)? true : false;
    }

    public int countCharacter(String input, char ch){
        int count = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ch){
                count += 1;
            }
        }
        return count;
    }

    public String reverseString(String input){
        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i -- ){
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
