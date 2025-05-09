package com.ohgiraffers.practice;

/* 드래곤은 몬스터이고 하늘을 날 수 있다.*/
public class Dragon implements Monster, Flying{
    private String name;
    private int hp; // 체력
    private int level;
    private int altitude; // 현재 고도
    private double flySpeed;
    private boolean isfly;
    private boolean isAlive;

    public Dragon(){}

    public Dragon(String name, int level){
        this.name = name;
        this.level = level;

        this.altitude = 0;
        this.hp = 100;
        this.flySpeed = 10;
        this.isfly = false;
        this.isAlive = true;

        System.out.println("이름이 " + name + "이고 레벨이 " + level + "인 드래곤이 생성되었습니다.");
    }

    @Override
    public int getCurrentAltitude() {
        return altitude;
    }

    @Override
    public void fly() {
        if(!isfly && altitude > 0){
            System.out.println("드래곤 " + name + "이 " + flySpeed + "의 스피드로 날아 오릅니다.");
        } else if (!isfly) {
            System.out.println("드래곤 " + name +"의 설정 고도가 0 이하기 때문에 날 수 없습니다.");
        } else{
            System.out.println("드래곤 " + name +"은 이미 날고 있습니다.");
        }
    }

    @Override
    public void setAltitude(int altitude) {
        if(altitude <= 0){
            System.out.println("고도는 양수로만 설정 가능합니다.");
            return;
        }

        if(altitude > MAX_ALTITUDE){
            System.out.println("최고 고도는" + MAX_ALTITUDE + "까지 가능합니다.");
            return;
        }

        this.altitude = altitude;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void attack() {
        System.out.println("드래곤" + name  + "이 바람을 가로지르며 공격을 합니다!!");
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;

        if(this.hp <= 0){
            System.out.println("드래곤" + name + "은 죽었습니다.");
            isAlive = false;
            return;
        }

        System.out.println("드래곤의 남은 체력 : " + hp);
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public void move() {
        System.out.println("드래곤 " + getName() + "이 이동합니다.");
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", level=" + level +
                '}';
    }
}
