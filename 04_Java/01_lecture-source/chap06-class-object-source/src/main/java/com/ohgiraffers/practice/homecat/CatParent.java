package com.ohgiraffers.practice.homecat;

public class CatParent {
    private final Cat cat = new Cat();
    private int churr;
    private int food;

    public CatParent(){
        this.churr = 3;
        this.food = 3;
    }
    public void giveChurr(){
        if(churr <= 0){
            System.out.println("츄르가 없습니다. 마트가서 사옵시다!");
        }
        cat.eatChurr();
    }

    public void giveFood(){
        if(food <= 0){
            System.out.println("사료가 없습니다. 마트가서 사옵시다!");
        }
        cat.eatFood();
    }

    public void showerCat(){
        cat.shower();
    }

    public void playCat(){
        cat.play();
    }

    public void touchCatTail(){
        cat.decreaseEmoRate(10, "꼬리를 만져서");
    }

    public void goMart(){
        cat.decreaseEmoRate(5, "마트를 가서");

        churr = 3;
        food = 3;
    }

    public boolean checkCatEmo(){
        cat.checkLike();

        if(cat.getemoRate() >= 100 || cat.getemoRate() < 0){
            return false;
        }

        return  true;
    }

}
