package LabWhileLoop;

import java.util.Scanner;

public class P09Moving {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = Integer.parseInt(scanner.nextLine());
            int y = Integer.parseInt(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());

            int volumeAvailable = x * y * h;
            int volumePackets = 0;
            int volumeLeft = 0;
            boolean done = false;
            boolean volume = false;
            while (!done || !volume) {
                String input = scanner.nextLine();
                if (input.equals("Done")) {
                    done = true;
                    break;
                } else {
                    int packets = Integer.parseInt(input);
                    volumeAvailable = volumeAvailable - packets;
                    if (volumeAvailable <= 0) {
                        volume = true;
                        break;
                    }
                }
            }
            if (done) {
                System.out.printf("%d Cubic meters left.", volumeAvailable);
            } else if (volume) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volumeAvailable));
            }

    }
}
