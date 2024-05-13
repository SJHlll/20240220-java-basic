package etc.stream;

import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

public class Mapping {

    // 이름과 칼로리만 가진 클래스를 설계
    private static class simpleDish {
        private String name;
        private int calories;

        public simpleDish(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        public simpleDish(Dish dish) {
            this.name = dish.getName();
            this.calories = dish.getCalories();
        }

        @Override
        public String toString() {
            return "simpleDish{" +
                    "name='" + name + '\'' +
                    ", calories=" + calories +
                    '}';
        }
    }


    private static class simpleDish2 {
        private String name;
        private Dish.Type type;

        public simpleDish2(String name, Dish.Type type) {
            this.name = name;
            this.type = type;
        }

        public simpleDish2(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }

        @Override
        public String toString() {
            return "simpleDish2{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }

    // stream의 map: 컬렉션 (리스트, 셋, 맵...)에서
    // 원하는 정보만 추출하여 새로운 컬렉션으로 반환해줌

    public static void main(String[] args) {

        List<Integer> caloriesList = menuList.stream()
//                .map(dish -> dish.getCalories())
                .map(Dish::getCalories)
                .collect(Collectors.toList());

        System.out.println(caloriesList);

        System.out.println("==================");
        /*
            요리 목록에서 메뉴 이름과 칼로리를 추출하고 싶다
         */
        menuList.stream()
//                .map(dish -> new simpleDish(dish))
                .map(simpleDish::new)
                .collect(Collectors.toList())
//                .forEach(dish -> System.out.println(dish));
                .forEach(System.out::println);

        System.out.println("==================");

        /*
            요리 목록에서 칼로리라 500칼로리보다 큰 음식을 필터링하고
            음식의 이름과 타입만 추출하기
         */

        menuList.stream()
                .filter(dish -> dish.getCalories() >= 500)
                .map(dish -> new simpleDish2(dish))
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println(dish));




    }

}
