package MoreExercise;

import java.util.Scanner;

public class P05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int employeesOverTime = Integer.parseInt(scanner.nextLine());
        //calculations
        double daysAfterTraining = days * 0.90;
        double normalWorkingHours = Math.floor(daysAfterTraining * 8);
        double extraWorkingHours = employeesOverTime * days * 2;
        double diffHours = (normalWorkingHours + extraWorkingHours - hoursNeeded);
        //conditions
        if (diffHours >= 0) {
            System.out.printf("Yes!%.0f hours left.", diffHours);
        } else {
            diffHours = Math.abs(diffHours);
            System.out.printf("Not enough time!%.0f hours needed.", diffHours);
        }
    }
}
