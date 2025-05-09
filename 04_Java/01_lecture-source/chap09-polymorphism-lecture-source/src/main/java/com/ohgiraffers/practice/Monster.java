package com.ohgiraffers.practice;

/**
 * 모든 몬스터가 공통적으로 가져야 할 기본 특성과 행동을 정의.
 */
public interface Monster {
    // 상수( static )
    int DEFAULT_SPAWN_LIMIT = 5;


    // 기본 속성 접근 메서드
    String getName();

    // 행동 메서드
    void attack();
    void takeDamage(int damage);
    boolean isAlive();
    void move();
}