package ExamJuly2020;

import java.util.Scanner;

public class P03CourierExpress {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double weight = Double.parseDouble(scanner.nextLine());
            String service = scanner.nextLine();
            int distance = Integer.parseInt(scanner.nextLine());
            double pricePerKm = 0;
            double addingKm = 0;
            if (weight < 1) {
                pricePerKm = 0.03;
            } else if (weight < 10) {
                pricePerKm = 0.05;
            } else if (weight < 40) {
                pricePerKm = 0.10;
            } else if (weight < 90) {
                pricePerKm = 0.15;
            } else if (weight < 150) {
                pricePerKm = 0.20;
            }
            if (service.equals("express")) {
                if (weight < 1) {
                    addingKm = pricePerKm * 0.80;
                } else if (weight < 10) {
                    addingKm = pricePerKm * 0.40;
                } else if (weight < 40) {
                    addingKm = pricePerKm * 0.05;
                } else if (weight < 90) {
                    addingKm = pricePerKm * 0.02;
                } else if (weight < 150) {
                    addingKm = pricePerKm * 0.01;
                }
            }
            double addingWeightPr = weight * addingKm;
            double addingTotal = distance * addingWeightPr;
            double totalCost = distance * pricePerKm + addingTotal;
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, totalCost);
    }
}
