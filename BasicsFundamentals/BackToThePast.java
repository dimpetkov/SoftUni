package ForCycles.ForCyclesMoreExercise;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double money = Double.parseDouble(scanner.nextLine());
            int endYear = Integer.parseInt(scanner.nextLine());

            double costOfLife = 0;
            double fund = 0;
        for (int year = 1800; year <= endYear ; year++) {
            if (year % 2 ==0) {
                costOfLife = costOfLife + 12000;
            } else {
                costOfLife = costOfLife + 12000 + 50 * (18 + year - 1800);
            }
            fund = money - costOfLife;
        }
        if (fund >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", fund);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(fund));
        }
    }
}
