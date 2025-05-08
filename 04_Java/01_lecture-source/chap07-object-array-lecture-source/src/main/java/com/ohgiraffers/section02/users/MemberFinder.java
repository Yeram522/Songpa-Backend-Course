package com.ohgiraffers.section02.users;

public class MemberFinder {

    public Member[] findallMember(){
        return MemeberRepository.findAllMembers();
    }
}
