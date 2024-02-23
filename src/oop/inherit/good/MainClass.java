package oop.inherit.good;

public class MainClass {

    public static void main(String[] args) {

        Warrior w1 = new Warrior();
        w1.name = "전사";
        w1.level = 1;
        w1.atk = 3;
        w1.hp = 50;
        w1.rage = 100;

        w1.characterInfo();


        Mage m1 = new Mage();
        m1.name = "마법사";
        m1.level = 1;
        m1.atk = 1;
        m1.hp = 25;
        m1.mana = 200;

        m1.characterInfo();


        Hunter h1 = new Hunter();
        h1.name = "사냥꾼";
        h1.level = 1;
        h1.atk = 4;
        h1.hp = 35;
        h1.pet = "멧돼지";

        h1.characterInfo();

    }

}
