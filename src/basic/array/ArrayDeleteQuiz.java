package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

    public static void main(String[] args) {

        /*
         1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

         2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

         - 추가
         배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
         더 이상 지울 친구가 없다면 프로그램 종료.
         */

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 저장된 캐릭터 : " + Arrays.toString(kakao));


        while (true) {

            boolean flag = false;
            System.out.println("");
            System.out.println("삭제 할 캐릭터를 입력해주세요.");
            System.out.print("> ");
            String name = sc.next();

            for (int i = 0; i < kakao.length; i++) {

                if (name.equals(kakao[i])) {

                    flag = true;

                    for (int j = i; j < kakao.length - 1; j++) {
                        kakao[j] = kakao[j + 1];
                    }

                    String[] newKakao = new String[kakao.length - 1];

                    for (int k = 0; k < newKakao.length; k++) {
                        newKakao[k] = kakao[k];
                    }

                    kakao = newKakao;
                    newKakao = null;

                    System.out.println("");
                    System.out.printf("%s 삭제 완료.\n", name);
                    System.out.println("수정 된 캐릭터 배열 : " + Arrays.toString(kakao));

                }

            }

            if (kakao.length == 0) {
                System.out.println("");
                System.out.println("삭제 할 캐릭터가 없습니다.");
                System.out.println("캐릭터 삭제를 종료합니다.");
                break;
            }


            if (!flag) {
                System.out.println("");
                System.out.println("해당하는 캐릭터가 없습니다.");
            }

        sc.close();

        }



    }

}
