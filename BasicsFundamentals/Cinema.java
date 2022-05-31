package CondStatementAdvancedExecrise;

import java.util.Scanner;

public class MyCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double price = 0.00;
        switch (type) {
            case "Premiere":
                price = r * c * 12.00;
                break;
            case "Normal":
                price = r * c * 7.50;
                break;
            case "Discount":
                price = r * c * 5.00;
                break;
        }
        System.out.printf("%.2f leva", price);
    }
}
