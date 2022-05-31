package MoreExercise;

import java.util.Scanner;

public class P07SafePasswordsGenerator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //|ABxyBA|
            //A -> ASCII (35 - 55)
            //B -> ASCII (64 - 96)
            //x -> int (1 - scanner a)
            //y -> int (1 - scanner b)
            //maximum passwords -> scanner max
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());

        int countMax = 0;
        char A = 35;
        char B = 64;
        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);
                countMax++;
                if (countMax == max) {
                    return;
                }
                if (A == 55) {
                    A = 35;
                } else {
                    A++;
                }
                if (B == 96) {
                    B = 64;
                } else {
                    B++;
                }
            }
        }
    }
}
