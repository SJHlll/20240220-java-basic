package etc;

import etc.stream.Dish;
import etc.stream.Menu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaAndStream {

    public static List<String> getHealthyDishName(List<Dish> menu) {
        /*
            요리 목록에서 칼로리가 400칼로리보다 작은 요리들만 추출해서
            칼로리가 낮은 순으로 오름차 정렬한 후
            그 요리들의 이름만 추출해서 리스트로 만든다
         */

        // 스트림을 사용하지 않은 코드
        List<Dish> lowCalroricDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                lowCalroricDishes.add(dish);
            }
        }

        // 칼로리를 낮은 순으로 오름차 정렬
        lowCalroricDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return o1.getCalories() - o2.getCalories();
            }
        });

        // 정렬된 리스트에서 이름만 뽑은 리스트 만들기
        List<String> dishNames = new ArrayList<>();
        for (Dish dish : lowCalroricDishes) {
            dishNames.add(dish.getName());
        }

        return dishNames;
    }

    // 스트림을 사용한 코드
    public static List<String> getHealthyDishName2(List<Dish> menu) {
        return menu.stream()
                .filter(dish -> dish.getCalories() < 400) // 400 칼로리 미만
                .sorted(Comparator.comparing(Dish::getCalories)) // 칼로리 오름차 정렬
                .map(Dish::getName) // 이름 추출
                .collect(Collectors.toList()); // 리스트에 넣기
    }

    public static void main(String[] args) {

        List<String> dishName1 = getHealthyDishName(Menu.menuList);
        System.out.println("dishName1 = " + dishName1);

        List<String> dishName2 = getHealthyDishName2(Menu.menuList);
        System.out.println("dishName2 = " + dishName2);

    }

}
