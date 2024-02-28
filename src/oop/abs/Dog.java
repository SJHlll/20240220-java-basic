package oop.abs;

public class Dog extends Pet {
    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("개가 잔다");
    }

    @Override
    public void eat() {
        System.out.println("개가 먹는다");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("개가 걷는다");
    }
}
