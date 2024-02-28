package oop.abs;

public class GoldFish extends Pet {
    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("금붕어는 안자");
    }

    @Override
    public void eat() {
        System.out.println("금붕어가 먹는다");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("금붕어가 헤엄친다");
    }
}
