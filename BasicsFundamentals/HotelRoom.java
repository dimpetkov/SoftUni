package CondStatementAdvancedExecrise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String month = scanner.nextLine();
            int nights = Integer.parseInt(scanner.nextLine());
        //adds
        double priceStudio = 0.00;
        double priceApartment = 0.00;

        if (month.equals("May") || month.equals("October")) {
            priceStudio = 50.00;
            priceApartment = 65.00;
            if (nights > 14) {
                priceStudio = priceStudio * 0.7;
                priceApartment = priceApartment * 0.9;
            } else if (nights > 7) {
                priceStudio = priceStudio * 0.95;
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.20;
            priceApartment = 68.70;
            if (nights > 14) {
                priceStudio = priceStudio * 0.80;
                priceApartment = priceApartment * 0.9;
            }
        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76.00;
            priceApartment = 77.00;
            if (nights > 14) {
                priceApartment = priceApartment * 0.9;
            }
        }
        double sumStudio = nights * priceStudio;
        double sumApartment = nights * priceApartment;
        System.out.printf("Apartment: %.02f lv.%n", sumApartment);
        System.out.printf("Studio: %.02f lv.%n", sumStudio);
    }
}
