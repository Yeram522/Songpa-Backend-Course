package com.ohgiraffers.practice;

public class MagicDragon extends Dragon implements MagicCapable{
    private int mana;
    private final int SPELL_MANA = 10;

    public MagicDragon(String name, int level){
        super(name, level);
        this.mana = MAX_MANA;
        System.out.println("드래곤 " + getName() + " 은 마법을 부릴 수 있습니다!" );
    }

    @Override
    public void castSpell() {
        if(this.mana - SPELL_MANA < 0){
            System.out.println("드래곤이 마나가 부족해서 마법을 쓸 수 없습니다.");
        }else {
            this.mana -= SPELL_MANA;
            System.out.println("드래곤이 마법을 부리기 시작합니다.");
        }
    }

}
