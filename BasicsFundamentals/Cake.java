package ExerciseWhileLoop;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int x = Integer.parseInt(scanner.nextLine());
            int y = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();

            int piecesCount = x * y;
            while (!input.equals("STOP")) {
                int pieces = Integer.parseInt(input);
                piecesCount = piecesCount - pieces;

                if (piecesCount <= 0) {
                    break;
                }
                input = scanner.nextLine();
            }
            if (piecesCount <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(piecesCount));
            } else {
                System.out.printf("%d pieces are left.", piecesCount);
            }
    }
}
