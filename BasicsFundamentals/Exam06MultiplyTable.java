package ExamJuly2020;

import java.util.Scanner;

public class P06MultiplyTable {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            int a = Integer.parseInt(String.valueOf(input.charAt(0)));
            int b = Integer.parseInt(String.valueOf(input.charAt(1)));
            int c = Integer.parseInt(String.valueOf(input.charAt(2)));
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= a; k++) {
                    int n = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, n);
                }
            }
        }
    }
}
