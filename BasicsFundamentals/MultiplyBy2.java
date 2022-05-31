package ConditionsAdvancedMoreExercise;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double n = scanner.nextDouble();
                if (n < 0) {
                    System.out.println("Negative number!");
                } else {
                    System.out.printf("Result: %.2f%n", n * 2);
                }
                while (n >= 0) {
                    n = scanner.nextDouble();
                    if (n < 0) {
                        System.out.println("Negative number!");
                    } else {
                        System.out.printf("Result: %.2f%n", n * 2);
                    }
                }
    }
}
