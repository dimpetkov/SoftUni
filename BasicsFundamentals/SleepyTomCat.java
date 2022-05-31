package MoreExercise;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 year = 365 days;
        //PlayTimeRate = 30 000 minutes/year;
        //in a work day 63 minutes/day to play;
        //in a day off 127 minutes/day to play;
        int daysOff = Integer.parseInt(scanner.nextLine());
        //calculations
        int playTimeDaysOff = daysOff * 127;
        int playTimeWorkDays = (365 - daysOff) * 63;
        int totalPlayTime = playTimeDaysOff + playTimeWorkDays;
        int diffTime = totalPlayTime - 30000;
        int hours = Math.abs(diffTime) / 60;
        int minutes = Math.abs(diffTime) % 60;
        //conditions
        if (diffTime >= 0) {
            System.out.printf("Tom will run away %n");
            System.out.printf("%d hours and %d minutes more for play %n", hours, minutes);
        } else {
            System.out.printf("Tom sleeps well %n");
            System.out.printf("%d hours and %d minutes less for play %n", hours, minutes);
        }
    }
}
