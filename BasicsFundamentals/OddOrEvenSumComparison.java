package ForCycles;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            int sumOdd = 0;
            int sumEven = 0;
        for (int position = 1; position <= n ; position++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (position % 2 == 0) {
                sumEven = sumEven + value;
            } else {
                sumOdd = sumOdd + value;
            }
         }
        if (sumEven == sumOdd) {
            System.out.printf("Yes%nSum = %d", sumEven);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sumEven - sumOdd));
        }
    }
}
