package CondStatementsAdvanced;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        //valid for [100...200] || [== 0]
        boolean isValid = (number >= 100 && number <= 200) || number == 0;
        if (!isValid) {
            System.out.println("invalid");
        }
    }
}
