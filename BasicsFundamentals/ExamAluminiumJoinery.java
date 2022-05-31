import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();

        double price = 0;
        if (count > 10) {

        switch (type) {
            case "90X130":
                price = 110.0;
                if (count > 60) {
                    price *= 0.92;
                } else if (count > 30) {
                    price *= 0.95;
                }
                break;
            case "100X150":
                price = 140.0;
                if (count > 80) {
                    price *= 0.90;
                } else if (count > 40) {
                    price *= 0.94;
                }
                break;
            case "130X180":
                price = 190.0;
                if (count > 50) {
                    price *= 0.88;
                } else if (count > 20) {
                    price *= 0.93;
                }
                break;
            case "200X300":
                price = 250.0;
                if (count > 50) {
                    price *= 0.86;
                } else if (count > 25) {
                    price *= 0.91;
                }
                break;
        }
    double totalPrice = price * count;

        switch (delivery) {
            case "With delivery":
                totalPrice += 60;
                break;
        }
        if (count >= 100) {
            totalPrice *= 0.96;
        }

    System.out.printf("%.2f BGN", totalPrice);

        } else {
            System.out.println("Invalid order");
        }
    }
}
