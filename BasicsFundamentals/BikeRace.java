package ConditionsAdvancedMoreExercise;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int juniors = Integer.parseInt(scanner.nextLine());
            int seniors = Integer.parseInt(scanner.nextLine());
            String rout = scanner.nextLine();

            double juniorFee = 0.00;
            double seniorFee = 0.00;
            switch (rout) {
                case "trail":
                    juniorFee = 5.50;
                    seniorFee = 7.00;
                    break;
                case "cross-country":
                    juniorFee = 8.00;
                    seniorFee = 9.50;
                    break;
                case "downhill":
                    juniorFee = 12.25;
                    seniorFee = 13.75;
                    break;
                case "road":
                    juniorFee = 20.00;
                    seniorFee = 21.50;
                    break;
            }
            double sum = juniors * juniorFee + seniors * seniorFee;
            if (rout.equals("cross-country") && (juniors + seniors) >= 50) {
                sum = sum * 0.75;
            }
        System.out.printf("%.2f", sum * 0.95);
    }
}
