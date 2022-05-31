package ExamJuly_2_20210;

import java.util.Scanner;

public class P02Spaceship {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        //crew >= 3 && crew <= 10;
        //room size 2m wide, 2m long, high = medium crew height + 40cm
        double spaceShipWidth = Double.parseDouble(scanner.nextLine());
        double spaceShipLength = Double.parseDouble(scanner.nextLine());
        double spaceShipHeight = Double.parseDouble(scanner.nextLine());
        double crewMediumHeight = Double.parseDouble(scanner.nextLine());
        //calculations
        double spaceShipVolume = spaceShipWidth * spaceShipLength * spaceShipHeight;
        double roomVolume = (crewMediumHeight + 0.40) * 2 * 2;
        double crewRoomCount = Math.floor(spaceShipVolume / roomVolume);
        if (crewRoomCount >= 3 && crewRoomCount <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", crewRoomCount);
        } else if (crewRoomCount < 3) {
            System.out.println("The spacecraft is too small.");
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
