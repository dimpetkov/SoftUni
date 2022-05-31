package ExerciseWhileLoop;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double change = Double.parseDouble(scanner.nextLine());

            double cents = change * 100;
            int coinsCount = 0;
            while (cents > 0) {
                if (cents >= 200) {
                    coinsCount++;
                    cents = cents - 200;
                } else if (cents >= 100) {
                    coinsCount++;
                    cents = cents - 100;
                } else if (cents >= 50) {
                    coinsCount++;
                    cents = cents - 50;
                } else if (cents >= 20) {
                    coinsCount++;
                    cents = cents - 20;
                } else if (cents >= 10) {
                    coinsCount++;
                    cents = cents - 10;
                } else if (cents >= 5) {
                    coinsCount++;
                    cents = cents - 5;
                } else if (cents >= 2) {
                    coinsCount++;
                    cents = cents - 2;
                }else if (cents >= 1) {
                    coinsCount++;
                    cents = cents - 1;
                } else {
                    break;
                }
            }
        System.out.println(coinsCount);
    }
}
