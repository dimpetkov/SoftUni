package ConditionsAdvancedMoreExercise;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int chrysanthemum = Integer.parseInt(scanner.nextLine());
            int roses = Integer.parseInt(scanner.nextLine());
            int tulips = Integer.parseInt(scanner.nextLine());
            String season = scanner.nextLine();
            String holiday = scanner.nextLine();

            double chrysanthemumPrice = 0.00;
            double rosesPrice = 0.00;
            double tulipsPrice = 0.00;
            double price = 0.00;

            if (season.equals("Spring") || season.equals("Summer")) {
                price = chrysanthemum * 2.00 + roses * 4.10 + tulips * 2.50;
            } else {
                price = chrysanthemum * 3.75 + roses * 4.50 + tulips * 4.15;
            }
            if (holiday.equals("Y")) {
                price = price * 1.15;
            }
            if (tulips > 7 && season.equals("Spring")) {
                price = price * 0.95;
            }
            if (roses >= 10 && season.equals("Winter")) {
                price = price * 0.90;
            }
            if (chrysanthemum + roses + tulips > 20) {
                price = price * 0.80;
            }
        System.out.printf("%.2f", price + 2);
    }
}
