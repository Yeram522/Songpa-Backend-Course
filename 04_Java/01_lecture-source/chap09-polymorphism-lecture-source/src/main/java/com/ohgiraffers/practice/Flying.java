package com.ohgiraffers.practice;

/* 날 수 있는 능력*/
public interface Flying {
    int MAX_ALTITUDE = 1000;

    int getCurrentAltitude();
    void fly();
    void setAltitude(int altitude);
}