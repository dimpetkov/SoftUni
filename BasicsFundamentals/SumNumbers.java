package ForCycles;

import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            //for every number from 1st to n-th
            //repeat: to read the value and add to sum
            //start step: 1st number
            //end point: n-th number
            //change: move to next number (+1)
        int sum = 0;
        for (int number = 1; number <= n ; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum = sum + value; //sum += value
        }
        System.out.println(sum);
    }
}
