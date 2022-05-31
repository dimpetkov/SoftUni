package CondStatementsAdvanced;

import java.util.Scanner;

public class P13SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();
        //other variables
        double priceRoomForOne = 18.00;
        double apartment = 25.00;
        double presidentAp = 35.00;
        double price = 0.00;
        switch (roomType) {
            case "room for one person":
                price = priceRoomForOne * (days - 1);
                break;
            case "apartment":
                if (days < 10) {
                    price = (days - 1) * (apartment - (apartment * 0.30));
                } else if (days > 10 && days < 15) {
                    price = (days - 1) * (apartment - (apartment * 0.35));
                } else if (days > 15) {
                    price = (days - 1) * (apartment - (apartment * 0.50));
                }
                break;
            case "president apartment":
                if (days < 10) {
                    price = (days - 1) * (presidentAp - (presidentAp * 0.10));
                } else if (days > 10 && days < 15) {
                    price = (days - 1) * (presidentAp - (presidentAp * 0.15));
                } else if (days > 15) {
                    price = (days - 1) * (presidentAp - (presidentAp * 0.20));
                }
                break;
        }
        switch (rating) {
            case "positive":
                price = price * 1.25;
                break;
            case "negative":
                price = price * 0.90;
        }
        System.out.printf("%.02f", price);
    }
}
