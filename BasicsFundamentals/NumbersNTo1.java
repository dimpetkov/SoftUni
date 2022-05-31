package ForCycles;

import java.util.Scanner;

public class P02NumbersNTo1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

                //staring point -> n
                //end point -> 1
                //repeat -> print
                //how change the variable -> -1
                for (int number = n; number >= 1; number -=1) {
                    //decreasing "for" cycle
                    System.out.println(number);
                }
    }
}
