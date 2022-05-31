package MoreExercise;

import java.util.Scanner;

public class P01UniquePINCodes {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= first; i++) {
            for (int prime = 2; prime <= second; prime++) {
                boolean isPrime = true;
                for (int factor = 2; factor < prime; factor++) {
                    if (prime % factor == 0) {
                        isPrime = false;
                        break;
                    }
                }
                for (int j = 2; j <= third; j++) {
                    if ((i % 2 == 0) && (isPrime) && (j % 2 == 0)) {
                        System.out.printf("%d %d %d%n", i, prime, j);
                    }
                }
            }
        }
    }
}
