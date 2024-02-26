package oop.this_super;

public class Player {

    String name;
    int level;
    int atk;
    int hp;

    Player() {
        System.out.println("Player의 기본 생성자 호출");
        this.level = 1;
        this.atk = 3;
        this.hp = 50;
    }

    Player(String name) {
        this();
        System.out.println("Player의 2번 생성자 호출");
//        level = 1;
//        atk = 3;
//        hp = 50;
        this.name = name; // 이 객체의 주소값을 this.name 으로 지정 가능함
    }

    Player(String name, int hp) {
        this(name); // 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 한다. 덮어씌울 수도 있음
        System.out.println("Player의 3번 생성자 호출");
        this.hp = hp;
    }

    void attack(Player target) {
//        System.out.println("S = " + this.name);
//        System.out.println("M = " + target.name);

        if (this == target) {
            System.out.println("자해 불가능");
            return;
        }

//        출력 메세지 : x가 y를 공격합니다
        System.out.printf("%s이(가) %s을(를) 공격함\n", this.name, target.name);

//        맞는 사람의 hp를 때리는 사람의 atk만큼 낮추고, 때리는 사람의 hp를 5 회복한다
        target.hp -= this.atk;
        this.hp += 5;

        System.out.printf("%s의 hp = %d\n%s의 hp = %d\n", this.name, this.hp, target.name, target.hp);

    }




    void characterInfo() {
        System.out.println();
        System.out.println("*** 캐릭터 정보 ***");
        System.out.println("# 닉네임 : " + name);
        System.out.println("# 레벨 : " + level);
        System.out.println("# 공격력 : " + atk);
        System.out.println("# 체력 : " + hp);
        System.out.println("이 메서드를 부른 객체의 아이디 : " + this.name);
    }

}
