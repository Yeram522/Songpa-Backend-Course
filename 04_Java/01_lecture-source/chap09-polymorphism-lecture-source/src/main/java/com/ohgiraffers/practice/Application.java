package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 입력을 통해 드래곤을 만들 수 있습니다.*/

        /* 입출력 루프*/
        Scanner sc = new Scanner(System.in);

        /*Monster 객체 배열*/
        Monster[] monsters = new Monster[Monster.DEFAULT_SPAWN_LIMIT]; // 최대 스폰 리미트 까지만 배열을 만든다.
        int monsterCount = 0;
        /* 1. 드래곤 생성하기 */
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
                    monsters[monsterCount] = new Dragon(name, level);
                    monsterCount += 1;
                    break;
                case 2:
                    // 마법 드래곤 생성
                    monsters[monsterCount] = new MagicDragon(name, level);
                    monsterCount += 1;
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
                    break;
            }

            if(monsterCount >= Monster.DEFAULT_SPAWN_LIMIT){
                System.out.printf("더 이상 몬스터를 생성할 수 없으므로 생성 프로그램을 종료합니다.");
            }
        }
        System.out.println("몬스터 생성 프로그램이 종료되었습니다.");

        System.out.println("<현재 생성된 몬스터>================================");
        for(int i = 0; i < monsterCount; i++){
            System.out.println("no " + i + " : " + monsters[i].toString());
        }
        System.out.println("==================================================");

        System.out.println("<몬스터 조작하기>===================================");
        while (true){
            System.out.println("행동할 드래곤 번호를 입력해주세요!(-1 누르면 종료)");
            int ndragon = sc.nextInt();
            if(ndragon == -1){
                break;
            }
            if(ndragon < 0 || ndragon > monsterCount){
                System.out.println("존재하지 않는 드래곤 입니다 다시 입력해주세요.");
                continue;
            }

            if(!((Dragon)monsters[ndragon]).isAlive()){
                System.out.println("죽어서 행동할 수 없습니다....ㅠㅠ");
            }

            System.out.println("어떤 행동을 할까요? [ 1: fly , 2 : move , 3: damaged , 4: attack,  5 : spel,  6. setAltitude]");
            int naction = sc.nextInt();

            switch (naction){
                case 1:
                    ((Dragon)monsters[ndragon]).fly(); // down-casting
                    break;
                case 2:
                    ((Dragon)monsters[ndragon]).move(); // down-casting
                    break;
                case 3:
                    ((Dragon)monsters[ndragon]).takeDamage(10); // down-casting
                    break;
                case 4:
                    ((Dragon)monsters[ndragon]).attack(); // down-casting
                    break;
                case 5:
                    if(monsters[ndragon] instanceof MagicDragon){
                        ((MagicDragon)monsters[ndragon]).castSpell(); // down-casting
                    }else{
                        System.out.println(monsters[ndragon].getName() + "은 일반 드래곤이라 마법을 사용할 수 없습니다..ㅜㅜ");
                    }
                    break;
                case 6:
                    int altitude = sc.nextInt();
                    ((Dragon)monsters[ndragon]).setAltitude(altitude);
                    break;
                default:
                    System.out.println("번호를 잘못입력하셨습니다.");
                    break;
            }

        }

        System.out.println("프로그램이 종료되었습니다.");

    }
}
