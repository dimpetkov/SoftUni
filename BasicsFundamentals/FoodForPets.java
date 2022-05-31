package March2020;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int days = Integer.parseInt(scanner.nextLine());
            double food = Double.parseDouble(scanner.nextLine());

            double biscuits = 0;
            int dogFoodTotal = 0;
            int catFoodTotal = 0;
        for (int i = 1; i <= days; i++) {
            int dog = scanner.nextInt();
            int cat = scanner.nextInt();
            dogFoodTotal = dogFoodTotal + dog;
            catFoodTotal = catFoodTotal + cat;
            if (i % 3 == 0) {
                biscuits = biscuits + (dog + cat) * 0.10;
            }
        }
        int foodTotal = dogFoodTotal + catFoodTotal;
        double foodEatenPercent = foodTotal / food * 100;
        double dogPercent = dogFoodTotal * 1.0 / foodTotal * 100;
        double catPercent = catFoodTotal * 1.0 / foodTotal * 100;
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", foodEatenPercent);
        System.out.printf("%.2f%% eaten from the dog.%n", dogPercent);
        System.out.printf("%.2f%% eaten from the cat.%n", catPercent);
    }
}
