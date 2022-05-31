package MoreExercise;

import java.util.Scanner;

public class P11HappyCatParking {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int days = Integer.parseInt(scanner.nextLine());
            int hoursPerDar = Integer.parseInt(scanner.nextLine());
            //even day and odd hour -> 2.50/h
            //odd day and even hour -> 1.25/h
            //all other cases -> 1/h

        double total = 0;
        for (int d = 1; d <= days; d++) {
            double fee = 0;
            for (int h = 1; h <= hoursPerDar; h++) {
                if (d % 2 == 0 && h % 2 != 0) {
                    fee = fee + 2.50;
                } else if (d % 2 != 0 && h % 2 == 0) {
                    fee = fee + 1.25;
                } else {
                    fee++;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", d, fee);
            total = total + fee;
        }
        System.out.printf("Total: %.2f leva", total);
    }
}
