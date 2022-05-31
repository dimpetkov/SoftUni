import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = 0;
        int y = 0;
        int z = 0;
        int w = 0;
        for (int i = 0; i <= n; i++) {
            x = y;
            y = z;
            z = w;
            w = x + y + z;
            if (w <= n) {
                System.out.printf("%d, ", w);
                if (w == 0) {
                    y++;
                }
            } else {
                System.out.println("End!");
                break;
            }
        }
    }
}
