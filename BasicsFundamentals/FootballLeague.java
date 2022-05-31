package ForCycles.ForCyclesMoreExercise;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int stadium = Integer.parseInt(scanner.nextLine());
            int fens = Integer.parseInt(scanner.nextLine());

            double a = 0;
            double percentageA = 0;
            double b = 0;
            double percentageB = 0;
            double v = 0;
            double percentageV = 0;
            double g = 0;
            double percentageG = 0;
            double occupancy = 1.00 * fens / stadium * 100;
        for (int i = 1; i <= fens; i++) {

            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    a++;
                    percentageA = a / fens * 100;
                    break;
                case "B":
                    b++;
                    percentageB= b / fens * 100;
                    break;
                case "V":
                    v++;
                    percentageV = v / fens * 100;
                    break;
                case "G":
                    g++;
                    percentageG = g / fens * 100;
                    break;
            }
        }
        System.out.printf("%.2f%%%n", percentageA);
        System.out.printf("%.2f%%%n", percentageB);
        System.out.printf("%.2f%%%n", percentageV);
        System.out.printf("%.2f%%%n", percentageG);
        System.out.printf("%.2f%%", occupancy);
    }
}
