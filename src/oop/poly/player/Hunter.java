package oop.poly.player;

public class Hunter extends Player {

    String pet;

    Hunter(String name) {
        super(name);

        this.pet = "멧돼지";
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 펫 : " + pet);
    }


}
