package Mid_Exam;

import java.util.Scanner;

public class P01ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double experienceNeed = Double.parseDouble(scanner.nextLine());
        int battles = Integer.parseInt(scanner.nextLine());
        double experienceGain = 0.0;
        int battleCount = 0;
        while (experienceGain < experienceNeed && battleCount < battles) {
            int experience = scanner.nextInt();
            battleCount ++;


            if (battleCount % 3 == 0 && battleCount != 0) {
                experienceGain += experience * 1.15;
            } else if (battleCount % 5 == 0 && battleCount != 0) {
                experienceGain += experience * 0.90;
            } else if (battleCount % 15 == 0 && battleCount != 0) {
                experienceGain += experience * 1.05;
            } else {
                experienceGain += experience;
            }

        }
        if (experienceGain >= experienceNeed) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", battleCount);
        } else {
            double experienceLess = experienceNeed - experienceGain;
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", experienceLess);
        }
    }
}
