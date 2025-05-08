package com.ohgiraffers.practice.homecat;

public class Cat {
    private int emoRate;

    public Cat(){
        this.emoRate = 50;
    }

    public void eatChurr(){
        emoRate += 20;
        System.out.println("[system] 고양이가 츄르를 먹습니다!");

        printemoRate();
    }

    public void eatFood(){
        emoRate += 10;

        System.out.println("[system] 고양이가 밥을 먹습니다!");

        printemoRate();
    }

    public void play(){
        emoRate += 15;

        System.out.println("[system] 고양이가 쥐잡기 게임을 즐거워합니다!");

        printemoRate();
    }

    public void shower(){
        emoRate -= 20;

        System.out.println("[system] 고양이가 씻김 당하고 있습니다..");

        printemoRate();

    }

    public void decreaseEmoRate(int decrease,String action){
        this.emoRate -= decrease;
        System.out.println("[system] 고양이가 기분이 안좋아졌습니다....");
        printemoRate();

    }


    public void checkLike(){
        if(emoRate < 0){
            System.out.println("[system] 고양이가 집을 나갔습니다....");

        }else if(emoRate >= 100){
            System.out.println("[system] 고양이가 행복해 합니다~");

        }
    }

    public int getemoRate(){
        return emoRate;
    }

    private void printemoRate(){
        System.out.println("[system] 현재 고양이의 상태 = " + this.emoRate);
    }

}
