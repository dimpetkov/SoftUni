package MoreExercise;

import java.util.Scanner;

public class P10Profit {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int oneLv = Integer.parseInt(scanner.nextLine());
            int twoLv = Integer.parseInt(scanner.nextLine());
            int fiveLv = Integer.parseInt(scanner.nextLine());
            int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= oneLv; i++) { //one lev notes
            int one = i * 1;
            for (int j = 0; j <= twoLv; j++) { // two lev notes
                int two = j * 2;
                for (int k = 0; k <= fiveLv; k++) { //five lev notes
                    int five = k * 5;
                    if (one + two + five == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
