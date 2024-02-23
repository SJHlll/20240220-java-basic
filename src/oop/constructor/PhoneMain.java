package oop.constructor;

public class PhoneMain {

    public static void main(String[] args) {

        Phone basic = new Phone();
        basic.showSpec();

        System.out.println("-----------------------------------");

        Phone galaxy = new Phone("갤럭시 s24");
        galaxy.showSpec();

        Phone iPhone = new Phone("아이폰 15","검은색");
        iPhone.showSpec();

    }

}
