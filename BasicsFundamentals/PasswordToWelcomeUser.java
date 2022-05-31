package LabWhileLoop;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String username = scanner.nextLine();
            String password = scanner.nextLine();
            //repeat: read passwords and compare with the given one
            //continue reading: while the password is diff

        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)) {
            enteredPassword = scanner.nextLine();
        }
        //cycle ends when entered password is same as the given
        System.out.printf("Welcome %s!", username);
    }
}
