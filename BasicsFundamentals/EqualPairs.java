package ForCycles.ForCyclesMoreExercise;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            int sumOdd = 0;
            int sumEven = 0;
            int diff = 0;
            int diffMax = 0;
        for (int i = 1; i <= n; i++) {
            int numOne = Integer.parseInt(scanner.nextLine());
            int numTwo = Integer.parseInt(scanner.nextLine());
            int sumCurrent = numOne + numTwo;
            if (i == 1) {
                sumOdd = sumCurrent;
            } else if (i % 2 == 0) {
                sumEven = sumCurrent;
                diff = Math.abs(sumOdd - sumEven);
                if (diff > diffMax) {
                    diffMax = diff;
                }
            } else {
                sumOdd = sumCurrent;
                diff = Math.abs(sumOdd - sumEven);
                if (diff > diffMax) {
                    diffMax = diff;
                }
            }
        }
        if (diffMax != 0) {
            System.out.printf("No, maxdiff=%d", diffMax);
        }else {
            System.out.printf("Yes, value=%d", sumOdd);
        }
    }
}
