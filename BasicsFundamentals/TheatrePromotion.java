package BasicSyntaxCon_Lab;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String day = scanner.nextLine();
            int age= Integer.parseInt(scanner.nextLine());
            int price = 0;
            boolean ageValid = true;
            switch (day) {
                case "Weekday":
                    if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                        price = 12;
                    } else if (age > 18 && age <= 64) {
                        price = 18;
                    } else {
                        ageValid = false;
                    }
                    break;
                case "Weekend":
                    if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                        price = 15;
                    } else if (age > 18 && age <= 64) {
                        price = 20;
                    } else {
                        ageValid = false;
                    }
                    break;
                case "Holiday":
                    if (age >= 0 && age <= 18) {
                        price = 5;
                    } else if (age > 18 && age <= 64) {
                        price = 12;
                    } else if (age > 64 && age <= 122) {
                        price = 10;
                    }else {
                        ageValid = false;
                    }
                    break;
            }
            if (!ageValid) {
                System.out.println("Error!");
            } else {
                System.out.println(price + "$");
            }
    }
}
