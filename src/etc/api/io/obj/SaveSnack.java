package etc.api.io.obj;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SaveSnack {

    public static void main(String[] args) {

        List<Snack> snackList = new ArrayList<>();
        Collections.addAll(snackList,
                new Snack("콘칩",1970,1500,"ㅇㅇ"),
                new Snack("사브레",1980,2500,"ㄴㅇ"),
                new Snack("오징어칩",1985,1000,"ㄴㄴ")
        );

        try(FileOutputStream fos = new FileOutputStream("C:/Myworkspace/snack.sav")) {

            //객체를 저장할 수 있는 보조 스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(snackList);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
