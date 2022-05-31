package ExamJuly2020;

import java.util.Scanner;

public class P05ExcursionSale {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int sea = Integer.parseInt(scanner.nextLine());
            int mountain = Integer.parseInt(scanner.nextLine());

            String input =scanner.nextLine();
            int seaCount = 0;
            int mountainCount = 0;
            int profit = 0;

            while (!input.equals("Stop")) {

                if (input.equals("sea")) {
                    seaCount++;
                    if (seaCount <= sea) {
                        profit += 680;
                    }
                } else if (input.equals("mountain")) {
                    mountainCount++;
                    if (mountainCount <= mountain) {
                        profit += 499;
                    }
                }
                if (seaCount >= sea && mountainCount >= mountain) {
                    System.out.printf("Good job! Everything is sold.%n");
                    break;
                }
                input = scanner.nextLine();
            }
        System.out.printf("Profit: %d leva.", profit);
    }
}
