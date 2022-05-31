package Exercise;

import java.util.Scanner;

public class P06GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceOneClothes = Double.parseDouble(scanner.nextLine());

        double decorSum = budget * 0.10;
        double clothSum = people * priceOneClothes;
        if (people > 150) {
            clothSum = clothSum * 0.90;
        }
        double totalSum = decorSum + clothSum;

        double diff = Math.abs(totalSum - budget);
        if (totalSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}
