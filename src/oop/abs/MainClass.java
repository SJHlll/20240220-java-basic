package oop.abs;

public class MainClass {

    public static void main(String[] args) {

//        추상 클래스는 스스로의 객체 생성이 불가능하다
//        하지만, 추상 클래스의 객체가 아예 생성이 안되는 것은 아니다
//        자식 객체를 통해 일치화 가능 (super())
//        Pet p = new Pet("애완동물","미정",null); (x)

        Pet dog = new Dog("뽀삐","푸들",3);
        Pet cat = new Cat("제리","페르시안",2);
        GoldFish fish = new GoldFish("니모","흰동가리",1);

        Pet[] pets = {
                dog, cat, fish
        };

        for (Pet pet : pets) {
            pet.takeNap();
            pet.eat();
            pet.walk();
            System.out.println(pet.sayHello());
        }

    }

}
