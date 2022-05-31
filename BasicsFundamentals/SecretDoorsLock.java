package MoreExercise;

import java.util.Scanner;

public class P08SecretDoorsLock {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int hundreds = Integer.parseInt(scanner.nextLine());
            int tens = Integer.parseInt(scanner.nextLine());
            int digits = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= hundreds; i++) {
            for (int j = 2; j <= tens; j++) {
                if (j == 2 || j == 3 || j == 5 || j == 7) {
                    for (int k = 2; k <= digits; k++) {
                        if (i % 2 == 0 && k % 2 == 0) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}
