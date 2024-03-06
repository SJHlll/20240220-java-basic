package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedRwExample {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();
        
        for (int i = 0; i < 100000; i++) {
            text.append(i + "ㅎㅇ\n");
        }

        try (FileWriter fr = new FileWriter("C:/Myworkspace/hello.txt");
             BufferedWriter bw = new BufferedWriter(fr)) {
            bw.write(new String(text)); // 문자기반 스트링이기 때문에 문자열 그대로 전달

            System.out.println("정상");

        } catch (Exception e) {
            e.printStackTrace();
        }



        try (FileReader fr = new FileReader("C:/Myworkspace/hello.txt");
            BufferedReader br = new BufferedReader(fr)) {

            // BufferedReader에는 readLine() 메서드가 있음
            // 한 줄을 통으로 읽어서 String으로 리턴해줌
            // 더 이상 읽을 데이터가 없으면 null을 리턴
            String str;
            while ((str = br.readLine()) != null) {
                
            }

            System.out.println("완료");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
