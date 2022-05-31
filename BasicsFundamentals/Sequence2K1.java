package LabWhileLoop;

import java.util.Scanner;

public class P04Sequence2k1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            //starting value = 1;
            //repeat: print the value and change it (* 2 + 1);
            //continue: <=n;
            //stop: when >n;
        int number = 1;
        while (number <= n) {
            System.out.println(number);
            number = number * 2 + 1;
        }
    }
}
