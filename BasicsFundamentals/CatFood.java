package ExamJuly_2_20210;

import java.util.Scanner;

public class P04CatFood {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        //1kg food -> 12.45;
        //100 - 200 gr -> small cats
        //200 - 300 gr -> big cats
        //300 - 400 gr -> giant cats
        int cats = Integer.parseInt(scanner.nextLine());
        int groupOne = 0; //small
        int groupTwo = 0; //big
        int groupThree = 0; //giant
        double foodTotal = 0;
        for (int i = 1; i <= cats; i++) {
            double gramsPerCat = Double.parseDouble(scanner.nextLine());
            if (gramsPerCat >= 100 && gramsPerCat < 200) {
                groupOne++;
            } else if (gramsPerCat >= 200 && gramsPerCat < 300) {
                groupTwo++;
            } else if (gramsPerCat >= 300 && gramsPerCat < 400) {
                groupThree++;
            }
            foodTotal += gramsPerCat;
        }
        double foodTotalPrice = foodTotal / 1000 * 12.45;
        System.out.printf("Group 1: %d cats.%n", groupOne);
        System.out.printf("Group 2: %d cats.%n", groupTwo);
        System.out.printf("Group 3: %d cats.%n", groupThree);
        System.out.printf("Price for food per day: %.2f lv.", foodTotalPrice);
    }
}
