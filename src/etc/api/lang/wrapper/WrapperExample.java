package etc.api.lang.wrapper;

public class WrapperExample {

    public static void main(String[] args) {

        int a = 100;
        boolean b = false;
        char c = 'a';
        double d = 3.14;

        // boxing : 기본 데이터 타입을 객체 타입으로 변환하는 과정 -> deprecated
//        Integer v1 = new Integer(a);
//        Boolean v2 = new Boolean(b);


        // unboxing : 객체 타입으로 포장된 값을 다시 기본 데이터 타입으로 풀어내는 과정 -> deprecated
//        int i = v1.intValue(); -> deprecated


        // autoboxing : 기본 타입을 자동으로 객체형으로 변환
        Integer v3 = a;
        Boolean v4 = false;
        Character v5 = c;
        Double v6 = d;

        // autounboxing : 객체 포장을 기본형으로 자동 해제 가능
        int i = v3;
        double d2 = v6;

        // Autoboxing 이후에 wrapper 클래스는 문자열을 기본형으로
        // 변환하는 데 많이 사용한다

        int i1 = Integer.parseInt("351");
        double d3 = Double.parseDouble("3.14");

        // 해당 타입으로 변환할 수 없는 문자열을 시도했을 경우
        // NumberFormatException 예외가 발생한다
        Integer.parseInt("24.35");


    }

}
