package ForCycles;

import java.util.Scanner;

public class P04EvenPowersOf2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            //всички четни степени na 2 от 0 до n
        //start point: 0
        //end point: n
        //repeat ...
        for (int step = 0; step <= n; step += 2) {
            System.out.printf("%.0f%n", Math.pow(2, step));
        }
    }
}
