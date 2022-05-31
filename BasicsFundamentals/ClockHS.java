package ForCycles.ForCyclesMoreExercise;

import java.util.Scanner;

public class P10ClockPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = 23;
        int min = 59;
        int sec = 59;
        for (int i = 0; i <= hours; i++) {
            for (int j = 0; j <= min; j++) {
                for (int k = 0; k <= sec; k++) {
                    System.out.printf("%d : %d : %d%n", i, j, k);
                }
            }
        }
    }
}
