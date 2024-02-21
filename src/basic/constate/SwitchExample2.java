package basic.constate;

import java.util.Scanner;

import static java.lang.System.in;

public class SwitchExample2 {


    public static void main(String[] args) {


        Scanner sc = new Scanner((in));
        System.out.print("점수를 입력하세요 ");
        int point = sc.nextInt();

//            switch의 기준값은 정수 혹은 문자열만 가능하다
//            연산의 결과값도 기준값으로 사용이 가능하다
        switch (point / 10) {
            case 10:
                if (point > 100) {
                    System.out.println("ss");
                    break;
                }
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;

            default:
                if (point > 100 || point < 0) {
                    System.out.println("ss");
                } else {
                    System.out.println("F");
                }


        }


    }


}



