package com.ohgiraffers.practice;

import java.util.Scanner;

public class DragonMaker {
    private final Scanner sc = new Scanner(System.in);
    private final Monster[] dragons = new Monster[Monster.DEFAULT_SPAWN_LIMIT]; // 최대 스폰 리미트 까지만 배열을 만든다.
    private int dragonsCount = 0;

    /* 드래곤 생성 루프 메서드 */
    public void makeDragon(){
        System.out.println("<몬스터 생성 프로그램>====================================");
        while(true){
            System.out.println("생성할 드래곤을 입력 해주세요. [1 : 일반 드래곤 , 2 : 마법 드래곤 ] (0을 누르면 종료합니다.)");
            int type = sc.nextInt();
            sc.nextLine();
            if(type == 0){
                break;
            }
            System.out.print("드래곤 이름:");
            String name = sc.nextLine();
            System.out.print("레벨 : ");
            int level = sc.nextInt();
            switch (type){
                case 1:
                    // 일반 드래곤 생성
                    dragons[dragonsCount] = new Dragon(name, level);
                    dragonsCount += 1;
                    break;
                case 2:
                    // 마법 드래곤 생성
                    dragons[dragonsCount] = new MagicDragon(name, level);
                    dragonsCount += 1;
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
                    break;
            }

            if(dragonsCount >= Monster.DEFAULT_SPAWN_LIMIT){
                System.out.println("더 이상 몬스터를 생성할 수 없으므로 생성 프로그램을 종료합니다.");
            }
        }
        System.out.println("몬스터 생성 프로그램이 종료되었습니다.");
    }

    /* 생성된 드래곤을 리스트로 보여주는 메서드 */
    public void showCreatedDragons(){
        System.out.println("<현재 생성된 몬스터>================================");
        for(int i = 0; i < dragonsCount; i++){
            System.out.println("no " + i + " : " + dragons[i].toString());
        }
        System.out.println("==================================================");
    }

    /* 생성된 드래곤들을 행동시키는 메서드*/
    public void operateDragons(){
        System.out.println("<드래곤 조작하기>===================================");
        while (true){
            System.out.println("행동할 드래곤 번호를 입력해주세요!(-1 누르면 종료)");
            int ndragon = sc.nextInt();
            if(ndragon == -1){
                break;
            }
            if(ndragon < 0 || ndragon >= dragonsCount){
                System.out.println("존재하지 않는 드래곤 입니다 다시 입력해주세요.");
                continue;
            }

            if(!((Dragon)dragons[ndragon]).isAlive()){
                System.out.println("죽어서 행동할 수 없습니다....ㅠㅠ");
            }

            System.out.println("어떤 행동을 할까요? [ 1: fly , 2 : move , 3: damaged , 4: attack,  5 : spel,  6. setAltitude]");
            int naction = sc.nextInt();

            switch (naction){
                case 1:
                    ((Dragon)dragons[ndragon]).fly(); // down-casting
                    break;
                case 2:
                    ((Dragon)dragons[ndragon]).move(); // down-casting
                    break;
                case 3:
                    ((Dragon)dragons[ndragon]).takeDamage(10); // down-casting
                    break;
                case 4:
                    ((Dragon)dragons[ndragon]).attack(); // down-casting
                    break;
                case 5:
                    if(dragons[ndragon] instanceof MagicDragon){
                        ((MagicDragon)dragons[ndragon]).castSpell(); // down-casting
                    }else{
                        System.out.println(dragons[ndragon].getName() + "은 일반 드래곤이라 마법을 사용할 수 없습니다..ㅜㅜ");
                    }
                    break;
                case 6:
                    int altitude = sc.nextInt();
                    ((Dragon)dragons[ndragon]).setAltitude(altitude);
                    break;
                default:
                    System.out.println("번호를 잘못입력하셨습니다.");
                    break;
            }

        }

        System.out.println("프로그램이 종료되었습니다.");
    }
}
