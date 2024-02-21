package basic.constate;

import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("키를 입력하세요(cm) : ");
        int height = sc.nextInt();
        
        if (height >= 140) {
            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();
            if (age >= 8) {
                System.out.println("타");
            } else if (age >= 6){
                System.out.println("잘타");
            }
        } else {
            System.out.println("타지마");
        }

        sc.close();

    }

}
