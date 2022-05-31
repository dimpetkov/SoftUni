import java.util.Scanner;

public class Number100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prompt for an int number
        int number = Integer.parseInt(scanner.nextLine());
        //out.println:
        // Less than 100;
        // Between 100 and 200;
        // Greater than 200
        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number <= 200) {
            System.out.println("Between 100 and 200");
        } else if (number > 200) {
            System.out.println("Greater than 200");
        }
    }
}
