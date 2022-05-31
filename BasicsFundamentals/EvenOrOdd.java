import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        // check if even number -> even, if odd -> odd
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            //odd -> number % 2 != 0
            System.out.println("odd");
        }
    }
}
