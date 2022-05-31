package Exercise;

import java.util.Scanner;

public class P07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneM = Double.parseDouble(scanner.nextLine());

        double addingTime = Math.floor(distance / 15);
        double resistance = addingTime * 12.5;

        double totalTimeIvan = (distance * timeForOneM) + resistance;

        if (worldRecord <= totalTimeIvan) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTimeIvan - worldRecord);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeIvan);
        }
    }
}
