package MoreExercise;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        double price = 0.00;
        //conditions
        if (n >= 100) {
            price = n * 0.06;
        } else if (n >= 20) {
            price = n * 0.09;
        } else {
            if (time.equals("day")) {
                price = 0.70 + n * 0.79;
            } else if (time.equals("night")) {
                price = 0.70 + n * 0.90;
            }
        }
        System.out.printf("%.2f", price);
    }
}
