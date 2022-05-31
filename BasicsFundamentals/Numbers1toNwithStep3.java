package ForCycles;

import java.util.Scanner;

public class P03Numbers1NWithStep3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            //to print number from 1 to n with step 3
        // start point: 1
        //end point: n
        //repeat: print
        //change: step +3
        for (int number = 1; number <= n ; number += 3) {
            System.out.println(number);
        }
    }
}
