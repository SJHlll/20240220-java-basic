package oop.poly.car;

import oop.modi.cls.pack2.C;

public class MainClass {

    public static void main(String[] args) {

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Porsche p1 = new Porsche();
        Porsche p2 = new Porsche();
        Porsche p3 = new Porsche();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();


//        다형성을 적용해서 서로 다른 타입들을 모아놓을 수 있다.
        Car[] cars = {s1, s2, s3, p1, p2, p3, t1, t2, t3, t4};
        for (Car c : cars) {
            c.run();
        }

        System.out.println("===================================");

        Driver kim = new Driver();
        kim.drive(s1);
        kim.drive(p2);
        kim.drive(t3);

        kim.buyCar("Sonata");
        kim.buyCar("Tesla");
        kim.buyCar("Porsche");

//        Car myTesla = kim.buyCar("Tesla");
//        myTesla.run();
//        Tesla t = (Tesla) myTesla;
//        t.activeAutopilot();

        Tesla myTesla = (Tesla) kim.buyCar("Tesla");
        myTesla.run();
        myTesla.activeAutopilot();

        System.out.println("===================================");

        CarShop shop = new CarShop();
        shop.carPrice(s2);
        shop.carPrice(t4);
        shop.carPrice(p1);


    }

}
