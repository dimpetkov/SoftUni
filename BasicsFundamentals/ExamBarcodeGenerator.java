import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();

        int is = Integer.parseInt(String.valueOf(start.charAt(0)));
        int js = Integer.parseInt(String.valueOf(start.charAt(1)));
        int ks = Integer.parseInt(String.valueOf(start.charAt(2)));
        int ls = Integer.parseInt(String.valueOf(start.charAt(3)));
        int ie = Integer.parseInt(String.valueOf(end.charAt(0)));
        int je = Integer.parseInt(String.valueOf(end.charAt(1)));
        int ke = Integer.parseInt(String.valueOf(end.charAt(2)));
        int le = Integer.parseInt(String.valueOf(end.charAt(3)));
        for (int i = is; i <= ie; i++) {
            for (int j = js; j <= je; j++) {
                for (int k = ks; k <= ke; k++) {
                    for (int l = ls; l <= le; l++) {
                        if (i % 2 == 1 && j % 2 == 1 && k % 2 == 1 && l% 2 == 1) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }

                }

            }
        }
    }
}
