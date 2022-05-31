package CondStatementAdvancedExecrise;

import java.util.Scanner;

public class P09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String leapOrNormal = scanner.nextLine();
        int countHolidays = Integer.parseInt(scanner.nextLine());
        int countWeekendsHome = Integer.parseInt(scanner.nextLine());

        double saturdayGames = (48 - countWeekendsHome) * 3.0 / 4;
        double holidaysGames = countHolidays * 2 / 3.0;

        double allGames = saturdayGames + countWeekendsHome + holidaysGames;

        switch (leapOrNormal) {
            case "leap":
                allGames = allGames * 1.15;
                break;
        }
        System.out.printf("%.0f", Math.floor(allGames));
    }
}
