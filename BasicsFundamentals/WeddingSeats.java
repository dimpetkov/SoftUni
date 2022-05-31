package MoreExercise;

import java.util.Scanner;

public class P06WeddingSeats {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String sector = scanner.nextLine();
            int rowsFirstSector = Integer.parseInt(scanner.nextLine());
            int seatsOddRow = Integer.parseInt(scanner.nextLine());

            char lastSector = sector.charAt(0);
            int seatsCount = 0;
        for (char i = 'A'; i <= lastSector; i++) { //sector
            for (int j = 1; j <= rowsFirstSector; j++) { //row
                int seats = 'a' + seatsOddRow - 1;
                if (j % 2 == 0) {
                    seats = seats + 2;
                }
                for (char k = 'a'; k <= seats; k++) {
                    System.out.printf("%c%d%c%n", i, j, k);
                    seatsCount++;
                }
            }
            rowsFirstSector++;
        }
        System.out.println(seatsCount);
    }
}
