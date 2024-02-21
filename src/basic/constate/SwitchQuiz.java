package basic.constate;

import java.util.Scanner;

import static java.lang.System.in;

public class SwitchQuiz {

    public static void main(String[] args) {

            /*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
         만약 사용자가 나눗셈을 선택할 때 0으로 나누려고 하면 빠꾸먹이기
        */


        Scanner sc = new Scanner((in));
        System.out.print("1번 정수를 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.print("연산자를 입력하세요 [+, -, *, /] : ");
        String cal = sc.next();

        System.out.print("2번 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        int result = 0;

        boolean flag = false;

        switch (cal) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":

                if (num2 == 0) {
                    System.out.println("연산할 수 없는 값입니다");
                    flag = true;
                    break;
                }

                result = num1 / num2;
                break;

            default:
                System.out.println("연산기호를 제대로 입력해주세요 [+, -, *, /]");
                flag = true;
                break;
        }

        if (!flag) {
            System.out.printf("%d %s %d = %d\n", num1, cal, num2, result);
        }
        sc.close();
    }

}
