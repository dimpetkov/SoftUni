package ExerciseWhileLoop;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String bookWanted = scanner.nextLine();

            String input = scanner.nextLine();
            int booksCount = 0;
            boolean found = false; //flack
            while (!input.equals("No More Books")) {

                if (bookWanted.equals(input)) {
                    found = true;
                    break;
                }
                booksCount++;
                input = scanner.nextLine();
            }
            if (found) { // if (found == true)
                System.out.printf("You checked %d books and found it.", booksCount);
            } else {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", booksCount);
            }
    }
}
