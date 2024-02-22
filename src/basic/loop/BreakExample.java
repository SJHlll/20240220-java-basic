package basic.loop;

import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            if (i > 6) break;
            System.out.print(i + " ");
        }
        System.out.println("\n반복문 종료");

        System.out.println("-----------------------------------");


        for (int j = 1; j < 11; j++) {
            if (j == 6) continue;
            System.out.print(j + " ");
        }
        System.out.println("\n반복문 종료");

        System.out.println("-----------------------------------");


        Scanner sc = new Scanner(System.in);

        System.out.println("15 x 6 = ???");
        System.out.println("모르면 0 입력");

        while (true) {
            System.out.print("> ");
            int answer = sc.nextInt();

            if (answer == 90) {
                System.out.println("ㅊㅋ");
                break;
            } else if (answer == 0) {
                System.out.println("90임");
                break;
            } else {
                System.out.println("zz");
            }
        }
        sc.close();
        
        
        
        
        
    }
    
}
