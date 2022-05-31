package MoreExercise;

import java.util.Scanner;

public class P07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mag = 3.25;
        double zum = 4.00;
        double ros = 3.50;
        double cac = 8.00;
        double tax = 0.05; //5% of the income
        //prompt for data
        int magNum = Integer.parseInt(scanner.nextLine());
        int zumNum = Integer.parseInt(scanner.nextLine());
        int rosNum = Integer.parseInt(scanner.nextLine());
        int cacNum = Integer.parseInt(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());
        //calculations
        double incomeGross = magNum * mag + zumNum * zum + rosNum * ros + cacNum * cac;
        double incomeNet = incomeGross - (incomeGross * tax);
        double yesNo = incomeNet - pricePresent;
        //conditions
        if (yesNo >= 0) {
            yesNo = Math.floor(yesNo);
            System.out.printf("She is left with %.0f leva.", yesNo);
        } else {
            yesNo = Math.ceil(Math.abs(yesNo));
            System.out.printf("She will have to borrow %.0f leva.", yesNo);
        }
    }
}
