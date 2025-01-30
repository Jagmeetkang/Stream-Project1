package nov30.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Dish> dishes = createDishes();

        List<String> cheapDishes = dishes.stream().filter(d -> d.getPrice() < 10)
                .map(Dish::getName).distinct().collect(Collectors.toList());
        System.out.println(cheapDishes);
    }


    public static List<Dish> createDishes() {
        List<Dish> dishes = new ArrayList<>();

        dishes.add(Dish.builder().name("Hamburger")
                .price(12.5).calories(800)
                .dishType(DishType.NOV_VEG)
                .ingredients(Arrays.asList("Ham", "Cheese", "Tomoto", "Bun")).build());
        dishes.add(Dish.builder().name("Samosa")
                .price(0.75).calories(300)
                .dishType(DishType.VEG)
                .ingredients(Arrays.asList("Potato", "Peas", "Salt", "Chilli")).build());
        dishes.add(Dish.builder().name("Sandwitch")
                .price(6.5).calories(400)
                .dishType(DishType.VEG)
                .ingredients(Arrays.asList("Bread", "Cheese", "Salt", "Chilli", "Ketchup")).build());
        dishes.add(Dish.builder().name("Butter Chicken")
                .price(6.5).calories(400)
                .dishType(DishType.VEG)
                .ingredients(Arrays.asList("Chicken", "Butter", "Salt", "Chilli", "Tomoto")).build());
        dishes.add(Dish.builder().name("Butter Chicken")
                .price(6.5).calories(400)
                .dishType(DishType.VEG)
                .ingredients(Arrays.asList("Chicken", "Butter", "Salt", "Chilli", "Tomoto")).build());

        return dishes;

    }
}
