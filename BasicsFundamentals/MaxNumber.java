package LabWhileLoop;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int max = Integer.MIN_VALUE;
            String command = scanner.nextLine();
            while (!command.equals("Stop")) {
                int number = Integer.parseInt(command);
                //check if is maximum
                if (number > max) {
                    max = number;
                }
                //new operation from console
                command = scanner.nextLine();
            }
        System.out.println(max);
    }
}
