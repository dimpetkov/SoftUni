package March2020;

import java.util.Scanner;

public class P03FitnessCard {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double money = Double.parseDouble(scanner.nextLine());
            String gender = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String sport = scanner.nextLine();

//          Gym Boxing Yoga Zumba Dances Pilates
//        M $42  $41    $45  $34   $51    $39
//        F $35  $37    $42  $31   $53    $37
//        over 19 -> 20% off

        double card = 0;
        boolean discount = age <= 19;
        switch (sport) {
            case "Gym":
                if (gender.equals("m")) {
                    card = 42;
                } else {
                    card = 35;
                }
                break;
            case "Boxing":
                if (gender.equals("m")) {
                    card = 41;
                } else {
                    card = 37;
                }
                break;
            case "Yoga":
                if (gender.equals("m")) {
                    card = 45;
                } else {
                    card = 42;
                }
                break;
            case "Zumba":
                if (gender.equals("m")) {
                    card = 34;
                } else {
                    card = 31;
                }
                break;
            case "Dances":
                if (gender.equals("m")) {
                    card = 51;
                } else {
                    card = 53;
                }
                break;
            case "Pilates":
                if (gender.equals("m")) {
                    card = 39;
                } else {
                    card = 37;
                }
                break;
        }
        if (discount) {
            card = card * 0.8;
        }
        if (money >= card) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            double diff = card - money;
            System.out.printf("You don't have enough money! You need $%.2f more.", diff);
        }

    }
}
