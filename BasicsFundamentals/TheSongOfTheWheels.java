package MoreExercise;

import java.util.Scanner;

public class P12TheSongOfTheWheels {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int m = Integer.parseInt(scanner.nextLine());
            //"abcd"
            //a * b + c * d = m
            //a < b
            //c > d
            //q, b, c, d -> 1 - 9
        int count = 0;
        int aP = 0;
        int bP = 0;
        int cP = 0;
        int dP = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d && (a * b + c * d == m)) {
                            if (count != 0) {
                                System.out.printf(" %d%d%d%d", a, b, c, d);
                                count++;
                            } else {
                                System.out.printf("%d%d%d%d", a, b, c, d);
                                count++;
                            }
                            if (count == 4) {
                                aP = a;
                                bP = b;
                                cP = c;
                                dP = d;
                            }
                        }
                    }
                }
            }
        }
        if (count >= 4) {
            System.out.printf("%nPassword: %d%d%d%d", aP, bP, cP, dP);
        } else if (count < 4) {
            System.out.printf("%nNo!");
        }
    }
}
