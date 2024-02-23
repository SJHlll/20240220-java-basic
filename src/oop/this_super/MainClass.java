package oop.this_super;

public class MainClass {

    public static void main(String[] args) {


        Player p1 = new Player();
        p1.name = "Player";
        p1.characterInfo();

        System.out.println("--------------------------");

        Player p2 = new Player("Player2");
        p2.characterInfo();
        System.out.println("main에서 p2의 주소값 : " + p2);

        System.out.println("--------------------------");

        Player p3 = new Player("Player3");
        p3.characterInfo();
        System.out.println("main에서 p3의 주소값 : " + p3);


    }
}
