package ConditionsAdvancedMoreExercise;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String season = scanner.nextLine();
            double km = Double.parseDouble(scanner.nextLine());

            double payGross = 0.00;
        //                              Пролет/Есен	    Лято	        Зима
        //км на месец <= 5000	        0.75 лв./км	    0.90 лв./км	   1.05 лв./км
        //5000 < км на месец <= 10000	0.95 лв./км	    1.10 лв./км	   1.25 лв./км
        //10000 < км на месец <= 20000	1.45 лв./км – за който и да е сезон
        //seasons: "Spring", "Summer", "Autumn", "Winter" (one season has four months)
        if (km > 10000 && km <= 20000) {
            payGross = 4 * km * 1.45;
        } else {
            switch (season) {
                case "Spring":
                case "Autumn":
                    if (km <= 5000) {
                        payGross = 4 * km * 0.75;
                    } else if (km > 5000 && km <= 10000) {
                        payGross = 4 * km * 0.95;
                    }
                    break;
                case "Summer":
                    if (km <= 5000) {
                        payGross = 4 * km * 0.90;
                    } else if (km > 5000 && km <= 10000) {
                        payGross = 4 * km * 1.10;
                    }
                    break;
                case "Winter":
                    if (km <= 5000) {
                        payGross = 4 * km * 1.05;
                    } else if (km > 5000 && km <= 10000) {
                        payGross = 4 * km * 1.25;
                    }
                    break;
            }
        }
        double payNet = payGross * 0.90;
        System.out.printf("%.2f", payNet);
    }

}
