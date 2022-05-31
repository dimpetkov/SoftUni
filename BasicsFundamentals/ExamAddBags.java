import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double bagPrice = Double.parseDouble(scanner.nextLine());
            double bagWeight = Double.parseDouble(scanner.nextLine());
            int daysToTrip = Integer.parseInt(scanner.nextLine());
            int bagNumbers = Integer.parseInt(scanner.nextLine());

            double bagWeightPrice = 0.00;

            if (bagWeight < 10) {
                bagWeightPrice = bagPrice * 0.20;
            } else if (bagWeight <= 20) {
                bagWeightPrice = bagPrice * 0.50;
            } else {
                bagWeightPrice = bagPrice;
            }
            if (daysToTrip < 7) {
                bagWeightPrice = bagWeightPrice * 1.40;
            } else if (daysToTrip <= 30) {
                bagWeightPrice = bagWeightPrice * 1.15;
            } else {
                bagWeightPrice = bagWeightPrice * 1.10;
            }
            double finalBagPrice = bagWeightPrice * bagNumbers;
        System.out.printf("The total price of bags is: %.2f lv. ", finalBagPrice);
    }
}
