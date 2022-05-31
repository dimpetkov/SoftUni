package March2020;

import java.util.Scanner;

public class P05SuitcasesLoad {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double capacity = Double.parseDouble(scanner.nextLine());
            String input = scanner.nextLine();
            int suitcases = 0;

            while (!input.equals("End")) {
                double load = Double.parseDouble(input);
                suitcases++;
                if (suitcases % 3 == 0) {
                    load = load * 1.10;
                }
                capacity = capacity - load;
                if (capacity > 0) {
                    input = scanner.nextLine();
                } else {
                    suitcases--;
                    System.out.printf("No more space!%n");
                    System.out.printf("Statistic: %d suitcases loaded.", suitcases);
                    break;
                }
            }
            if (input.equals("End")) {
                System.out.printf("Congratulations! All suitcases are loaded!%n");
                System.out.printf("Statistic: %d suitcases loaded.", suitcases);
            }
    }
}
