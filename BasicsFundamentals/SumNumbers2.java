package LabWhileLoop;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
            //stop: when sum of all numbers is >= number;
            //continue: sum numbers < number;
            //repeat: add number to sum, and read the new value;
        int sum = 0;
        while (sum < number) {
            int n = Integer.parseInt(scanner.nextLine());
            sum += n;
        }
        System.out.println(sum);
    }
}
