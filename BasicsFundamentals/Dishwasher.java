package MoreExerciseWhileLoop;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int bottles = Integer.parseInt(scanner.nextLine());

            String input = scanner.nextLine();
            int detergent = bottles * 750;
            int cycleCount = 0;
            int dishes = 0;
            int pots = 0;
            while (!input.equals("End")) {
                cycleCount++;
                int loading = Integer.parseInt(input);
                   if (cycleCount % 3 == 0) {
                        pots = pots + loading;
                        detergent = detergent - loading * 15;
                    } else {
                        dishes = dishes + loading;
                        detergent = detergent - loading * 5;
                    }
                if (detergent < 0) {
                    System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
                    break;
                }
                input = scanner.nextLine();
            }
            if (input.equals("End")) {
                System.out.println("Detergent was enough!");
                System.out.printf("%d dishes and %d pots were washed.%n", dishes, pots);
                System.out.printf("Leftover detergent %d ml.%n", detergent);
            }
    }
}
