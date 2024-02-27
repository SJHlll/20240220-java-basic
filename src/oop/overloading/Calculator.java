package oop.overloading;

public class Calculator {

    /*
     # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
      생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.

     - 오버로딩 적용 조건:
     1. 매개 변수의 데이터 타입이 다를 것! or
     2. 매개 변수의 전달 순서가 다를 것! or
     3. 매개 변수의 개수가 다를 것.
    */

    void inputData() {}


    void inputData(int a) {}


    void inputData(int a, int b) {}


//    void inputData(int b, int a) {} (x)


    void inputData(String s) {}


    void inputData(int a, double d) {}


    void inputData(double d, int a) {}


//    void inputData(int number) {} (x) 점수 매개값 1개를 받는 메서드는 이미 선언함


//    int inputData(int number) {
//        return 0;
//    } (x) 반환 유형(return type)은 오버로딩에 영향을 미치지 못한다


    void calcRectArea(int r) {
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 : %d\n",
                r, r * r);
        return;
    }
    void calcRectArea(int x, int y) {
        System.out.printf("가로 %d, 세로 %d의 길이를 가진 직사각형의 넓이 : %d\n",
                x, y, x * y);
        return;
    }
    void calcRectArea(int x1, int x2, int y) {
        System.out.printf("윗변 %d, 밑변 %d, 높이 %d의 길이를 가진 사다리꼴의 넓이 : %d\n",
                x1, x2, y, (x1 + x2) * y / 2);
        return;
    }




}
