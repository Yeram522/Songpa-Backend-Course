package com.ohgiraffers.section02.users;

public class MemeberRepository {

    private final static Member[] memebers;

    private static int count;

    static {
        memebers = new Member[10];
    }

    public static boolean store(Member[] newMembers){

        for(int i = 0; i < newMembers.length; i++){
            memebers[count++] = newMembers[i];
        }

        return true;
    }

    public static Member[] findAllMembers(){
        return memebers;
    }

}
