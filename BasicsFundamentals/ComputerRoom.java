package ExamJuly_2_20210;

import java.util.Scanner;

public class P03ComputerRoom {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        //      March to May    June to August
        //Day   10.50    	 	 12.60 
        //Evening   8.40       		 10.20 
        //>=4 people 10% discount
        //>=5 hours spent 50% discount
        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int group = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        double pricePersonHour = 0;
        switch (month) {
            case "march":
            case "april":
            case "may":
                if (dayTime.equals("day")) {
                    pricePersonHour = 10.50;
                } else {
                    pricePersonHour = 8.40;
                }
                break;
            case "june":
            case "july":
            case "august":
                if (dayTime.equals("day")) {
                    pricePersonHour = 12.60;
                } else {
                    pricePersonHour = 10.20;
                }
                break;
        }
        if (group >= 4) {
            pricePersonHour = pricePersonHour * 0.9;
        }
        if (hours >= 5) {
            pricePersonHour = pricePersonHour * 0.5;
        }
        double totalPrice = pricePersonHour * group * hours;
        System.out.printf("Price per person for one hour: %.2f%n", pricePersonHour);
        System.out.printf("Total cost of the visit: %.2f", totalPrice);
    }
}
