package Lab;

import java.util.Scanner;

public class P07CinemaTickets {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int students = 0;
        int standard = 0;
        int kids = 0;
        double allTickets = 0;
        boolean finish = false;
        boolean end = false;
        while (!finish) {
            String movie = input;
            int seats = Integer.parseInt(scanner.nextLine());
            double currentTickets = 0;
            String ticketType = scanner.nextLine();
            while (!end) {
                switch (ticketType) {
                    case "student":
                        students++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }
                currentTickets++;
                allTickets++;
                if (currentTickets >= seats) {
                    end = true;
                } else {
                    ticketType = scanner.nextLine();
                    if (ticketType.equals("End")) {
                        end = true;
                    }
                }
            }
            double percentSold = currentTickets / seats * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percentSold);
            end = false;
            input = scanner.nextLine();
            if (input.equals("Finish")) {
                finish = true;
            }
        }
        double studentPercent = students / allTickets * 100;
        double standardsPercent = standard / allTickets * 100;
        double kidsPercent = kids / allTickets * 100;
        System.out.printf("Total tickets: %.0f%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", studentPercent);
        System.out.printf("%.2f%% standard tickets.%n", standardsPercent);
        System.out.printf("%.2f%% kids tickets.%n", kidsPercent);
    }
}
