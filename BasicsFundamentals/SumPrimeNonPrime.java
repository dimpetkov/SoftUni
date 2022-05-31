package Exercise;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            int primeSum = 0;
            int nonPrimeSum = 0;

            while (!input.equals("stop")) {
                int currentNum = Integer.parseInt(input);
                if (currentNum < 0) {
                    System.out.println("Number is negative.");
                    input = scanner.nextLine();
                    continue;
                }
                boolean isPrime = true;
                for (int i = 2; i <= currentNum - 1; i++) {
                    if (currentNum % i == 0) {
                        nonPrimeSum = nonPrimeSum + currentNum;
                        isPrime = false;
                        break;
                    }

                }
                if (isPrime) {
                    primeSum = primeSum + currentNum;
                }

                input = scanner.nextLine();
            }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
    }
}
