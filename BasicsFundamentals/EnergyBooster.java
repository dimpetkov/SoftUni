package March2020;

import java.util.Scanner;

public class P03EnergyBooster {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String fruit = scanner.nextLine();
            String size = scanner.nextLine();
            int orderSets = Integer.parseInt(scanner.nextLine());

            double price = 0;
            switch (fruit) {
                case "Watermelon":
                    if (size.equals("small")) {
                        price = 2 * 56;
                    } else {
                        price = 5 * 28.70;
                    }
                    break;
                case "Mango":
                    if (size.equals("small")) {
                        price = 2 * 36.66;
                    } else {
                        price = 5 * 19.60;
                    }
                    break;
                case "Pineapple":
                    if (size.equals("small")) {
                        price = 2 * 42.10;
                    } else {
                        price = 5 * 24.80;
                    }
                    break;
                case "Raspberry":
                    if (size.equals("small")) {
                        price = 2 * 20;
                    } else {
                        price = 5 * 15.20;
                    }
                    break;
            }
            double totalPrice = price * orderSets;
            if (totalPrice > 1000) {
                totalPrice = totalPrice * 0.5;
            } else if (totalPrice >= 400) {
                totalPrice = totalPrice * 0.85;
            }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
