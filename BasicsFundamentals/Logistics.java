package ForCycles.ForCyclesMoreExercise;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

        double loadTotal = 0;
            int van = 0;
            int truck = 0;
            int train = 0;

        for (int i = 1; i <= n; i++) {
            int load = Integer.parseInt(scanner.nextLine());
            loadTotal = loadTotal + load;
            if (load <= 3) {
                van = van + load;
            } else if (load >= 4 && load <= 11) {
                truck = truck + load;
            } else {
                train = train + load;
            }
        }

        double vanPrice = van * 200.0;
        double vanPercentage = van / loadTotal * 100.0;
        double truckPrice = truck * 175;
        double truckPercentage = truck / loadTotal * 100.0;
        double trainPrice = train * 120;
        double trainPercentage = train / loadTotal * 100.0;
        double mediumPrice = (vanPrice + truckPrice + trainPrice) / loadTotal;
        System.out.printf("%.2f%n", mediumPrice);
        System.out.printf("%.2f%%%n", van / loadTotal * 100.0);//van
        System.out.printf("%.2f%%%n", truck / loadTotal * 100.0);//truck
        System.out.printf("%.2f%%%n", train / loadTotal * 100.0);//train
    }
}
