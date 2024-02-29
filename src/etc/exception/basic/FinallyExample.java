package etc.exception.basic;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"강아지", "고양이", "참새"};

        for (int i = 0; i < pets.length; i++) {
            try {
                System.out.println(pets[i] + "우에에엥");
            } catch (Exception e) {
                System.out.println("???");
            } finally {
//                finally 블록에는 예외 발생 여부와 상관없이
//                항상 실행하고 싶은 문장을 작성함
//                객체를 반납하거나 메모리에서 해체할 때 (close()) finally 사용
                System.out.println("크아아악");
                System.out.println("================================");

            }
        }

    }

}
