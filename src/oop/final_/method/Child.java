package oop.final_.method;

public class Child extends Parent{

    @Override
    void method1() {
        super.method1();
    }

    @Override
    void method2() {
        super.method2();
    }

//    void method3() {
//        super.method3("오버라이딩");
//    } (x) -> final 메서드는 오버라이딩을 막는다. (물려주는 대로 써야 한다)

}
