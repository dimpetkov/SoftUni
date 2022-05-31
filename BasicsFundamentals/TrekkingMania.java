package March2020;

import java.util.Scanner;

public class P04TrekkingMania {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int groups = Integer.parseInt(scanner.nextLine());
            int musala = 0;
            int monblanc = 0;
            int kilimandgaro = 0;
            int k2 = 0;
            int everest = 0;
            double peopleAll = 0;
        for (int i = 1; i <= groups; i++) {
            int people = scanner.nextInt();
            if (people >= 41) {
                everest = everest + people;
            } else if (people >= 26) {
                k2 = k2 + people;
            } else if (people >= 13) {
                kilimandgaro = kilimandgaro + people;
            } else if (people >= 6) {
                monblanc = monblanc + people;
            } else {
                musala = musala + people;
            }
            peopleAll = peopleAll + people;
        }
        double musalaPercent = musala / peopleAll * 100;
        double monblancPercent = monblanc / peopleAll * 100;
        double kilimandgaroPercent = kilimandgaro / peopleAll * 100;
        double k2Percent = k2 / peopleAll * 100;
        double everestPercent = everest / peopleAll * 100;
        System.out.printf("%.2f%%%n", musalaPercent);
        System.out.printf("%.2f%%%n", monblancPercent);
        System.out.printf("%.2f%%%n", kilimandgaroPercent);
        System.out.printf("%.2f%%%n", k2Percent);
        System.out.printf("%.2f%%%n", everestPercent);
    }
}
