package oop.static_.method;

import util.Utility; // Utility.makeLine();

import static util.Utility.*; // makeLine();

public class MainClass {

    public static void main(String[] args) {

        Count c = new Count();
        int result = c.method1();

        int result2 = Count.method2();


        makeLine();

        String name = input("입력해보셈 > ");
        System.out.println("name = " + name);

        makeLine();
    }

}
