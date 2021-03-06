package ForCycles.Exercise;

import java.util.Scanner;

public class P05DivideWithoutRemainder {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            int p1 = 0; //by2
            int p2 = 0; //by3
            int p3 = 0; //by4
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum % 2 == 0) {
                p1++;
            }
            if (currentNum % 3 == 0) {
                p2++;
            }
            if (currentNum % 4 == 0) {
                p3++;
            }
        }
        System.out.printf("%.2f%%%n", p1 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p2 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p3 * 1.0 / n * 100);
    }
}
