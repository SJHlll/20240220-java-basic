package oop.modi.member.pack1;

public class B {

    public B() {

        A a = new A();
        a.x = 1; // public
        a.y = 2; // default
//        a.z = 3; (x) private

        a.method1();
        a.method2();
//        a.method3(); (x)

    }

}
