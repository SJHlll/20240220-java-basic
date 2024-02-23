package oop.string;

import java.net.Inet4Address;
import java.util.Scanner;

public class StringQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호 13자리를 입력해주세요. (- 포함)");
        System.out.println("ex) ######-#######");


        while (true) {

            System.out.print("> ");
            String num = sc.next();

            if (num.equals("exit")) break;

            if (num.indexOf("-") == -1) {
                System.out.println("-를 포함해서 입력해주세요.");
                continue;
            }

            if (num.length() != 14) {
                System.out.println("주민등록번호를 제대로 입력해주세요.");
                continue;
            }

            String frontNum = num.substring(0, 6);
            String backNum = num.substring(7, 14);
            String year = num.substring(0, 2);
            String month = num.substring(2, 4);
            String day = num.substring(4, 6);
            char gen = num.charAt(7);

            int years = Integer.parseInt(year);
            if (gen == '1' || gen == '2') years += 1900;
            else if (gen == '3' || gen == '4') years += 2000;

            int age = 2024 - years;

            String gender = null;
            if (gen == '1' || gen == '3') gender = "남자";
            else if (gen == '2' || gen == '4') gender = "여자";


            System.out.printf("%s - %s -> %d년 %s월 %s일 %d세 %s\n", frontNum, backNum, years, month, day, age, gender);


        sc.close();
        }


    }
    /*
             1. 주민등록번호 13자리를 입력받습니다.
             2. 주민등록번호는 -을 포함해서 받을 예정입니다.
             3. 13자리가 아니라면 다시 입력받습니다.
             ex )
             921013 - 1234567 -> 1992년 10월 13일 32세 남자
             960223 - 2345678 -> 1996년 2월 23일 28세 여자
             031125 - 3456789 -> 2003년 11월 25일 21세 남자
             031125 - 4123456 -> 2003년 11월 25일 21세 여자


             제대로 출력이 될 때 까지 다시 입력받으세요

    */

}
