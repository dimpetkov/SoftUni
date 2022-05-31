import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read two numbers int from console
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        //number1 > number2
        if (number1 >= number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}
