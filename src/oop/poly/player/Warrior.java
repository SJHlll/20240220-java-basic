package oop.poly.player;

public class Warrior extends Player {

    int rage;

    Warrior(String name) {

//        모든 생성자에는 super()가 내장되어있다
//        자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
//        부모의 속성과 기능이 실존하게 되고, 물려줄 수 있다.
        super(name);
//        this.name = name; -> 부모의 생성자가 대신 초기화를 해줌
        this.rage = 100;
    }

    /*
         - 전사의 고유 기능인 rush 메서드를 작성합니다.

         - rush의 대상은 모든 직업들 입니다.

         - 만약 rush의 대상이 전사라면 10의 피해를 받고,
          마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.

         - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.

         - 남은 체력도 출력해 주세요.

         - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
         */
    public void rush(Player target) {

        if (this == target) {
            System.out.println("자기 자신에게 시전이 불가능합니다.");
            System.out.println("----------------------------");
            return;
        } else if (target instanceof Mage) {
            target.hp -= 20;
            System.out.printf("%s가 %s에게 돌진을 시전했습니다.\n%s(마법사)는 20의 피해를 입었습니다.\n%s의 남은 체력 : %d\n",
                    this.name, target.name, target.name, target.name, target.hp);
        } else if (target instanceof Hunter) {
            target.hp -= 15;
            System.out.printf("%s가 %s에게 돌진을 시전했습니다.\n%s(헌터)는 15의 피해를 입었습니다.\n%s의 남은 체력 : %d\n",
                    this.name, target.name, target.name, target.name, target.hp);
        } else if (target instanceof Warrior) {
            target.hp -= 10;
            System.out.printf("%s가 %s에게 돌진을 시전했습니다.\n%s(전사)는 10의 피해를 입었습니다.\n%s의 남은 체력 : %d\n",
                    this.name, target.name, target.name, target.name, target.hp);
        }
        System.out.println("----------------------------");


    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 분노 : " + rage);
    }


}
