package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Sorting {

    public static void main(String[] args) {

        // 음식 목록 중 칼로리가 낮은 순 정렬 (오름차순)
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("===========================");

        // 음식 목록 중 칼로리가 높은 순 정렬 (내림차순)
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("===========================");

        // 500칼로리보다 작은 요리 중 top3
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500)
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);
    }

}
