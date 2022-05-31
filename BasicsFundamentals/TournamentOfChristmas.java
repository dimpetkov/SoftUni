package March2020;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int days = Integer.parseInt(scanner.nextLine());

            int wins = 0;
            int loses = 0;
            int daysWin = 0;
            double money = 0;

        for (int i = 1; i <= days; i++) {
            String play = scanner.nextLine();
            double currentMoney = 0;

            while (!play.equals("Finish")) {
                String score = scanner.nextLine();
                if (score.equals("win")) {
                    wins++;
                    currentMoney = currentMoney + 20;
                } else {
                    loses++;
                }
                play = scanner.nextLine();
            }
            if (wins > loses) {
                currentMoney = currentMoney * 1.10;
                daysWin++;
            }
            money = money + currentMoney;
            wins = 0;
            loses = 0;
            currentMoney = 0;
        }
        int daysLose = days - daysWin;
        if (daysWin > daysLose) {
            money = money * 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", money);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", money);
        }
    }
}
