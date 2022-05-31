package CondStatementAdvancedExecrise;

import java.util.Scanner;

public class MySummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (time) {
            case "Morning":
                if (temp <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if ( temp <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (temp <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temp <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (temp <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temp <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, ger your %s and %s.", temp, outfit, shoes);
    }
}
