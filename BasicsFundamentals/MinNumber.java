package LabWhileLoop;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            int number = Integer.parseInt(command);
            //check if is maximum
            if (number < min) {
                min = number;
            }
            //new operation from console
            command = scanner.nextLine();
        }
        System.out.println(min);
    }
}
