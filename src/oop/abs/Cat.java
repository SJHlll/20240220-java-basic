package oop.abs;

public class Cat extends Pet {
    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("고양이가 잔다");
    }

    @Override
    public void eat() {
        System.out.println("고양이가 먹는다");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("고양이가 걷는다");
    }
}
