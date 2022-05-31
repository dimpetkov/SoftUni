import java.util.Scanner;

public class ExamAirLine {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String company = scanner.nextLine();
            int adultTickets = Integer.parseInt(scanner.nextLine());
            int childTickets = Integer.parseInt(scanner.nextLine());
            double ticketPrice = Double.parseDouble(scanner.nextLine());
            double serviceTax = Double.parseDouble(scanner.nextLine());
            //calculations
            double adultTotalPrice = adultTickets * ticketPrice;
            double childPrice = ticketPrice * 0.30;
            double childTotalPrice = childTickets * childPrice;
            double totalService = (adultTickets + childTickets) * serviceTax;
            double totalGross = childTotalPrice + adultTotalPrice + totalService;
            double profit = totalGross * 0.20;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", company, profit);
    }
}
