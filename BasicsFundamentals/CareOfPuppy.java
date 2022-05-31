package March2020;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int food = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();
            int foodLeft = food * 1000;
            boolean adopted = false;
            while (!adopted) {
                if (input.equals("Adopted")) {
                    adopted = true;
                } else {
                    int meal = Integer.parseInt(input);
                    foodLeft = foodLeft - meal;
                    input = scanner.nextLine();
                }
            }
            if (foodLeft >= 0) {
                System.out.printf("Food is enough! Leftovers: %d grams.", foodLeft);
            } else {
                System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodLeft));
            }
    }
}
