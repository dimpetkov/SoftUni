package Lab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int start = Integer.parseInt(scanner.nextLine());
            int end = Integer.parseInt(scanner.nextLine());
            int magic = Integer.parseInt(scanner.nextLine());

            int count = 0;
            boolean magicNum = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, i + j);
                    magicNum = true;
                    break;
                }
            }
            if (magicNum == true) {
                break;
            }
        }
        if (magicNum == false) {
            System.out.printf("%d combinations - neither equals %d", count, magic);
        }
    }
}
