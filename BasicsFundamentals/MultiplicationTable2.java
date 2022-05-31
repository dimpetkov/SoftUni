package BasicSyntaxCon_Lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int theInteger = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());
        if (multiplier <= 10) {
            for (int i = multiplier; i <= 10; i++) {
                int result = theInteger * i;
                System.out.printf("%d X %d = %d%n", theInteger, i, result);
            }
        } else {
            int result = theInteger * multiplier;
            System.out.printf("%d X %d = %d", theInteger, multiplier, result);
        }
    }
}
