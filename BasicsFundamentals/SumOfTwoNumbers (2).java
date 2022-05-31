package MoreExercise;

import java.util.Scanner;

public class P09SumOfTwoNumbers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int start = Integer.parseInt(scanner.nextLine());
            int end = Integer.parseInt(scanner.nextLine());
            int magic = Integer.parseInt(scanner.nextLine());

            int count = 0;
            int countSuccess = 0;
        for (int a = start; a <= end; a++) {
            for (int b = start; b <= end; b++) {
                count++;
                if (a + b == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, a, b, magic);
                    countSuccess++;
                    return;
                }
            }
        }
        if (countSuccess == 0) {
            System.out.printf("%d combinations - neither equals %d", count, magic);
        }
    }
}
