package oop.modi.member.pack2;

import oop.modi.member.pack1.A;

public class C {

    public C() {
        A a = new A();

        a.x = 1; // public
//        a.y = 2;  // default
//        a.z = 3; // private

        a.method1();
//        a.method2();
//        a.method3();

    }

}
