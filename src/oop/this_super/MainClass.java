package oop.this_super;

public class MainClass {

    public static void main(String[] args) {


        Player p1 = new Player();
        p1.name = "Player1";
        p1.characterInfo();

        System.out.println("--------------------------");

        Player p2 = new Player("Player2");
        p2.characterInfo();

        System.out.println("--------------------------");

        Player p3 = new Player("Player3", 100);
        p3.characterInfo();

        System.out.println("--------------------------");

        p1.attack(p2);
        p2.attack(p1);
        p3.attack(p1);


        System.out.println("--------------------------");

        Warrior w1 = new Warrior("Warrior1");
        w1.characterInfo();

        System.out.println("--------------------------");

        Mage m1 = new Mage("Mage1");
        m1.characterInfo();

        System.out.println("--------------------------");

        Hunter h1 = new Hunter("Hunter1");
        h1.characterInfo();

    }
}
