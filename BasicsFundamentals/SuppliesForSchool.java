package March2020;

import java.util.Scanner;

public class P01SuppliesForSchool {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int pens = Integer.parseInt(scanner.nextLine());
            int markers = Integer.parseInt(scanner.nextLine());
            double liquid = Double.parseDouble(scanner.nextLine());
            int discount = Integer.parseInt(scanner.nextLine());

            double totalGross = pens * 5.80 + markers * 7.20 + liquid * 1.20;
            double totalNet = totalGross - (totalGross * discount / 100);

        System.out.printf("%.3f", totalNet);
    }
}
