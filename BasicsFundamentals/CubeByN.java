import java.util.Scanner;

public class CubeNByN {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());

            String sign = "";
        for (int i = 1; i <= n; i++) {
            sign = sign + "*";
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(sign);
        }
    }
}
