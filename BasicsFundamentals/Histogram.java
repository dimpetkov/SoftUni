package ForCycles.Exercise;

import java.util.Scanner;

public class P04Histogram {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            double p1 = 0;
            double p2 = 0;
            double p3 = 0;
            double p4 = 0;
            double p5 = 0;
        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine()); //get the currentNum from the console

            if (currentNum < 200) {
                p1++; //increase p1
            } else if (currentNum < 400) {
                p2++;
            } else if (currentNum < 600) {
                p3++;
            } else if (currentNum < 800) {
                p4++;
            } else {
                p5++;
            }

        }
        System.out.printf("%.2f%%", p1 / n * 100);
        System.out.printf("%n%.2f%%", p2 / n * 100);
        System.out.printf("%n%.2f%%", p3 / n * 100);
        System.out.printf("%n%.2f%%", p4 / n * 100);
        System.out.printf("%n%.2f%%", p5 / n * 100);
    }
}
