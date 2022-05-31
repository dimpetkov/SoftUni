import java.util.Scanner;

public class WeatherForecast2V3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = Double.parseDouble(scanner.nextLine());

        if (temp >= 26.00) {
            if (temp <= 35.00) {
                System.out.println("Hot");
            }
        } else if (temp >= 20.1) {
            if (temp <= 25.9) {
                System.out.println("Warm");
            }
        } else if (temp >= 15.00) {
            if (temp <= 20.00) {
                System.out.println("Mild");
            }
        } else if (temp >= 12.00) {
            if (temp <= 14.9) {
                System.out.println("Cool");
            }
        } else if (temp >= 5.00) {
            if (temp <= 11.9) {
                System.out.println("Cold");
            }
        }
        if (temp < 5.00) {
            System.out.println("unknown");
        } else if (temp > 35.00) {
            System.out.println("unknown");
        }
    }
}
