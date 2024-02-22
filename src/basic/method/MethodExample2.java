package basic.method;

public class MethodExample2 {

    /*
# 반환값, 반환 유형 (return value, return type)

1. 반환값이란 메서드의 실행 결과값을 의미합니다.

2. 매개변수는 여러 개 존재할 수 있지만, 반환값은 오직 한 개만
 존재해야 합니다.

3. 전달되는 값의 타입을 반환 유형이라고 하며, 메서드를 선언할 때
 메서드 이름 앞에 반드시 반환 유형을 명시해야 합니다.

4. return이라는 키워드를 사용하며 return 뒤에 전달할 값을
 지정합니다. (변수, 상수)

5. 반환값이 있는 메서드는 호출문 자체가 하나의 값으로 처리될 수 있기 때문에
 반환값을 다른 변수에 대입할 수도 있고, 다른 메서드의 매개값으로도
 처리될 수 있습니다.

6. 모든 메서드가 반환값이 있는 것은 아닙니다. 메서드 실행 후에
 반환할 값이 딱히 없다면 return을 생략해도 됩니다.

7. 이 때는 반환유형을 메서드를 선언할 때 비워두지 마시고
 void라는 키워드를 작성해 주셔야 합니다.

8. 모든 메서드는 return을 만나면 강제로 메서드가 종료됩니다.
 따라서 조건 없이 return문 아래에 코드를 작성할 수 없습니다.
 void메서드에서는 return 키워드를 탈출 기능으로 사용할 수 있습니다.

*/

    //    x - y 까지의 누적합계를 구하는 메서드
    static int calcRangeTotal(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }


    //    매개변수가 필요없는 경우
    static String selectRandomFood() {
        double rn = Math.random();
        if (rn > 0.66) {
            return "치킨";
        } else if (rn > 0.33) {
            return "족발";
        } else {
            return "삼겹살";
        }
    }

//    정수 n개를 전달하면 그 정수들의 총 합을 리턴하는 메서드

    static int calcNumberTotal(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }


//    가변변수 (가변 파라미터)를 사용한 매개변수 작성
//    콤마로 나열되어 들어오는 여러개의 값을 배열로 묶어서 내부로 전달한다
    static int calcNumberTotal2(int... nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }


    public static void main(String[] args) {

        int result = calcRangeTotal(34, 96);
        System.out.println("result = " + result);


        System.out.println("selectRandomFood() = " + selectRandomFood());

        int[] arr = {10, 30, 50, 70, 90, 110, 130};
        int total = calcNumberTotal(arr);
        System.out.println("total = " + total);

        total = calcNumberTotal(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("total = " + total);

        
//        가변 파라미터에 값을 보낼 때는 콤마로 쭉 나열하거나
//        배열로 포장해서 보내도 됨
        total = calcNumberTotal2(1,2,3,4,5,6,7);
        System.out.println("total = " + total);

    }

}
