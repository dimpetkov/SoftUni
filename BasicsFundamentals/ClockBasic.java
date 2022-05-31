package Lab;

import java.util.Scanner;

public class P01Clock {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        for (int hour = 0; hour <= 23; hour++) {
            //for every minute from 0 to 59
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + ":" + minute);
            }
        }
    }
}
