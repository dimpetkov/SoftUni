package MoreExercise;

import java.util.Scanner;

public class P06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double foodDayDog = Double.parseDouble(scanner.nextLine());
        double foodDayCat = Double.parseDouble(scanner.nextLine());
        double foodDayTurtleGR = Double.parseDouble(scanner.nextLine());
        //how much food all pets need per day
        double foodDayTurtle = foodDayTurtleGR / 1000;
        double foodDayAll = foodDayDog + foodDayCat + foodDayTurtle;
        //food for the period for all pets
        double foodPeriodAll = foodDayAll * days;
        double foodDiff = food - foodPeriodAll;
        //conditions
        if (foodDiff >= 0) {
            foodDiff = Math.floor(foodDiff);
            System.out.printf("%.0f kilos of food left.", foodDiff);
        } else {
            foodDiff = Math.ceil(Math.abs(foodDiff));
            System.out.printf("%.0f more kilos of food are needed.", foodDiff);
        }
    }
}
