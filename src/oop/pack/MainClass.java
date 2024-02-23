// 패키지 선언은 항상 클래스 최상단에 위치해야 함
package oop.pack;

// 작성중인 패키지와 다른 곳에 위치한 클래스 정보를 불러오려면 import가 필요하다
//import oop.pack.fruit.Apple;
//import oop.pack.fruit.Banana;
//import oop.pack.fruit.Melon;
import oop.pack.fruit.*; // fruit 폴더의 모든 클래스를 import 하겠다
import oop.pack.fruit.Apple;
import oop.pack.juice.*;

public class MainClass {

    public static void main(String[] args) {

//        다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
//        반드시 패키지 경로를 직접 명시해 주어야 함

        Apple a = new Apple();
        oop.pack.juice.Apple a2 = new oop.pack.juice.Apple();
        Banana b = new Banana();
        Melon m = new Melon();

    }

}
