package ExamJuly2020;

import java.util.Scanner;

public class P04Workout {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int nDays = Integer.parseInt(scanner.nextLine());
            double mKm = Double.parseDouble(scanner.nextLine());
            double kmPerDay = mKm;
            double kmTotal = mKm;
        for (int i = 1; i <= nDays; i++) {
            double percentIncrease = Double.parseDouble(scanner.nextLine());
            kmPerDay = kmPerDay + kmPerDay * (percentIncrease / 100);
            kmTotal += kmPerDay;
        }
        if (kmTotal >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(kmTotal - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - kmTotal));
        }
    }
}
