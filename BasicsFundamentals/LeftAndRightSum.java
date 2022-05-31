package ForCycles;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            int sumA = 0;
            int sumB = 0;
        for (int number = 1; number <= 2 * n ; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (number <= n) {
                sumA = sumA + value;
            } else {
                sumB = sumB + value;
            }
        }
        if (sumA == sumB) {
            System.out.printf("Yes, sum = %d", sumA);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumA - sumB));
        }
    }
}
