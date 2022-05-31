package LabWhileLoop;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = z; i <= n; i = x + y) {
            x = y;
            y = z;
            z = x + y;
            if (z <= n) {
                System.out.printf("%d, ", z);
                if (z == 0) {
                    y++;
                }
            } else {
                System.out.println("End!");
                break;
            }
        }
    }
}
