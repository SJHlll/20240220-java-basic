package oop.this_super;

public class Player {

    String name;
    int level;
    int atk;
    int hp;

    Player() {
        System.out.println("Player의 기본 생성자 호출");
        level = 1;
        atk = 3;
        hp = 50;
    }

    Player(String name) {
        System.out.println("Player의 2번 생성자 호출");
        level = 1;
        atk = 3;
        hp = 50;
        this.name = name; // 이 객체의 주소값을 this.name 으로 지정 가능함
        System.out.println("생성자에서 this의 주소값 : " + this);
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
