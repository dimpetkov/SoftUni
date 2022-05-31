package BasicSyntaxCon_Lab;

import java.util.Scanner;

public class P04BackIn30Mins {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int hours = Integer.parseInt(scanner.nextLine());
            int minutes = Integer.parseInt(scanner.nextLine());
            int minsLater = minutes + 30;
            int newMins = minsLater % 60;
            int newHours = hours + minsLater / 60;
            if (newHours == 24) {
                newHours = 0;
            }
        System.out.printf("%d:%02d", newHours, newMins);

    }
}
