package March2020;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double record = Double.parseDouble(scanner.nextLine());
            double meters = Double.parseDouble(scanner.nextLine());
            double secForMeter = Double.parseDouble(scanner.nextLine());
            //every 50m -> 30 secs slowing down
        double timeToEnd = meters * secForMeter;
        double timesDelay = Math.floor(meters / 50) * 30;
        double totalTime = timeToEnd + timesDelay;

        if (totalTime < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            double diff = totalTime - record;
            System.out.printf("No! He was %.2f seconds slower.",diff);
        }
    }
}
