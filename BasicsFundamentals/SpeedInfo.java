package Exercise;

import java.util.Scanner;

public class PB03SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        String result = "";

        if (speed <= 10) {
            result = "slow";
            //System.out.println("slow");
        } else if (speed <= 50) {
            result = "average";
            //System.out.println("average");
        } else if (speed <= 150) {
            result = "fast";
            //System.out.println("fast");
        } else if (speed <= 1000) {
            result = "ultra fast";
            //System.out.println("ultra fast");
        } else {
            result = "extremely fast";
            //System.out.println("extremely fast");
        }
        System.out.println(result);
    }
}
