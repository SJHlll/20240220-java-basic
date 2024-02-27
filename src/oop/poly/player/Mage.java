package oop.poly.player;

public class Mage extends Player {

    int mana;

    Mage(String name) {
        super(name);
        this.mana = 200;
    }


    public void blizzard(Player[] targets) {
        if (this.mana >= 30) {
            this.mana -= 30;
            System.out.printf("%s이(가) 눈보라를 시전했습니다.\n30의 마나 소모됨. 남은 마나 %d\n",
                    this.name, this.mana);
        } else {
            System.out.println("마나가 부족합니다.");
            return;
        }

        System.out.println("----------------------------");

        for (Player target : targets) {
            if (target == this) continue;
            int damage = (int) (Math.random() * 6 + 10);
            target.hp -= damage;
            System.out.printf("%s이(가) %d의 피해를 입었습니다. (남은 체력 : %d)\n",
                    target.name, damage, target.hp);
        }

        System.out.println("----------------------------");
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 마나 : " + mana);
    }


}
