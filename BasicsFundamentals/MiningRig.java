package ExamJuly_2_20210;

import java.util.Scanner;

public class P01MiningRig {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //13 graphic cards and 13 connectors
        int cardPrice = Integer.parseInt(scanner.nextLine());
        int connectorPrice = Integer.parseInt(scanner.nextLine());
        double electricityPrice = Double.parseDouble(scanner.nextLine()); //per card per day
        double dailyIncome = Double.parseDouble(scanner.nextLine()); //per card

        int totalCardsCost = cardPrice * 13;
        int totalConnectorsCost = connectorPrice * 13;
        int totalSpending = totalCardsCost + totalConnectorsCost + 1000;
        double dailyNetCardIncome = dailyIncome - electricityPrice;
        double allCardsDailyIncome = dailyNetCardIncome * 13;
        double payBack = Math.ceil(totalSpending / allCardsDailyIncome);

        System.out.printf("%d%n", totalSpending);
        System.out.printf("%.0f", payBack);
    }
}
