package etc.api.lang.math;

public class MathQuiz {

    /*
         1 ~ 10이 전달되면 1이 반환되고,
         11 ~ 20이 전달되면 2가 반환되고,
         21 ~ 30이 전달되면 3이 반환되고.......
         이러한 로직을 수행하는 static 메서드 page를 선언해 보세요.
    */

    public static int page(int num) {
        int ceil = (int) Math.ceil((double) num / 10);
        System.out.println(ceil + "페이지");
        return num;
    }

    public static void main(String[] args) {

        page(9);
        page(11);
        page(23);
        page(42);
        page(117);

    }



}
