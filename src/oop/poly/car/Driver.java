package oop.poly.car;

public class Driver {

    public void drive(Car c) {
        System.out.println("부르르르릉");
        c.run();
    }

    public Car buyCar(String name) {
        if (name.equals("Sonata")) {
            System.out.println("소나타띠링");
            return new Sonata();
        } else if (name.equals("Porsche")) {
            System.out.println("포르쉐띠링");
            return new Porsche();
        } else if (name.equals("Tesla")) {
            System.out.println("테슬라띠링");
            return new Tesla();
        } else {
            System.out.println("?");
            return null;
        }
    }

}
