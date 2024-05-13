package etc.stream;

import java.util.Comparator;
import java.util.Optional;

import static etc.stream.Menu.menuList;
import static java.util.Comparator.comparing;

public class Finding {

    public static void main(String[] args) {

        // 음식 메뉴 중에 채식주의자가 먹을 수 있는 요리가 있는가?
        boolean flag1 = menuList.stream()
                .filter(dish -> dish.getCalories() >= 500)
                .anyMatch(dish -> dish.isVegetarian());

        System.out.println("flag1 = " + flag1);


        // 음식 메뉴 중에 칼로리가 50미만인 음식이 있는가?
        boolean flag2 = menuList.stream()
                .anyMatch(dish -> dish.getCalories() < 50);

        System.out.println("flag2 = " + flag2);

        // 음식 메뉴 중에 모든 요리가 1000칼로리 미만이다
        boolean flag3 = menuList.stream()
                .anyMatch(dish -> dish.getCalories() < 1000);

        System.out.println("flag3 = " + flag3);

        // 음식 메뉴 중에 모든 요리가 100칼로리 미만이 아니다
        boolean flag4 = menuList.stream()
                .noneMatch(dish -> dish.getCalories() < 100);

        System.out.println("flag4 = " + flag4);

        // 음식 중에 칼로리가 제일 낮은 음식
        Dish dish1 = menuList.stream()
                .min(comparing(Dish::getCalories))
                .get();
        System.out.println("dish1 = " + dish1);

        // 음식 중에 칼로리가 제일 높은 음식
        Dish dish2 = menuList.stream()
                .max(comparing(Dish::getCalories))
                .get();
        System.out.println("dish2 = " + dish2);

    }


}
