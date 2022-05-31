package CondStatementsAdvanced;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        //Mon-Fri
        // banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        // 2.50	    1.20	0.85	1.45	    2.70	5.50	    3.85

        Double price = 0.00;
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            }
                if (price != 0.00) {
                    double total = quantity * price;
                    System.out.printf("%.02f", total);
            } else {
                System.out.println("error");
            }
            //Sat-Sun
            //banana	apple	orange	grapefruit	kiwi	pineapple	grapes
            //2.70	    1.25	0.90	1.60	    3.00	5.60	    4.20
        } else if (day.equals("Saturday") || (day.equals("Sunday"))) {
            if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
            }
            if (price != 0.00) {
                double total = quantity * price;
                System.out.printf("%.02f", total);
            } else {
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }
    }
}
