package MoreExercise;

import java.util.Scanner;

public class P13PrimePairs {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int firstStart = Integer.parseInt(scanner.nextLine());
            int secondStart = Integer.parseInt(scanner.nextLine());
            int firstDiff = Integer.parseInt(scanner.nextLine());
            int secondDiff = Integer.parseInt(scanner.nextLine());

        for (int a = firstStart; a <= firstStart + firstDiff ; a++) { //first pair
            for (int b = secondStart; b <= secondStart + secondDiff; b++) { //second pair
                boolean first = true;
                boolean second = true;
                for (int aPr = 2; aPr < a; aPr++) {
                    if (a % aPr == 0) {
                        first = false;
                    }
                }
                for (int bPr = 2; bPr < b; bPr++) {
                    if (b % bPr == 0) {
                        second = false;
                    }
                }
                if (first && second) {
                    System.out.printf("%d%d%n", a, b);
                }
            }
        }
    }
}