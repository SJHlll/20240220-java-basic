package etc.api.collection.app;

import util.Utility;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static util.Utility.makeLine;

public class HashMapExample {

    /*
         # Map
         - Key / Value가 한 세트를 이루는 자료구조
         - Key값을 통해 Value를 참조하는 방식.
         - Key는 중복 저장을 허용하지 않는다.
    */

    // Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 설정

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // Map에 데이터를 추가하는 메서드 : put(key, value)
        map.put("멍멍이", "김철수");
        map.put("야옹이", "박영희");
        map.put("짹쨱이", "홍길동");
        System.out.println(map);

        // Map은 Key의 중복 저장을 허용하지 않는다
        // 만약 중복 Key를 사용해 put을 호출하면 value만 수정됨
        map.put("멍멍이", "김뽀삐");
        map.put("어흥이", "김철수");
        System.out.println(map);

        // Map 내부에 Key의 존재 유무를 확인하는 메서드 : containsKey(key)
        System.out.println(map.containsKey("멍멍이"));

        // Map 내부의 값을 참조하는 법 : get(key)
        String nick = "멍멍이";
        if (map.containsKey(nick)) {
            System.out.printf("%s 별명을 가진 학생은 %s입니다.\n", nick, map.get(nick));
        } else {
            System.out.println("그런 사람 없습니다.");
        }

        // Map의 크기를 확인하는 메서드 : size()
        System.out.println("map.size() = " + map.size());

        makeLine();
        // Map에서 Key들만 추출하는 메서드 : keySet()
        // 모든 key들을 set에 담아서 반환한다 -> 반복문 처리 가능
        Set<String> keys = map.keySet();

        for (String s : keys) {
            System.out.println("key : " + s + ", value : " + map.get(s));
        }

        // Map의 객체를 삭제 : remove(key)
        // key를 주면 value도 함께 제거됨
        map.remove("야옹이");
        System.out.println(map);

    }

}
