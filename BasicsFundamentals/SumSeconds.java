package Exercise;

import java.util.Scanner;

public class PB01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sum = firstNum + secondNum + thirdNum;

        int minutes = sum / 60;
        int seconds = sum % 60;

        if (seconds < 10) {
            System.out.printf("%d:%.0d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
