package BasicSyntaxCon_Lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //starting point: 1
        //check for odd number, if true -> print the number
        //print the sum of them
    int number = 1;
    int sumOddNumbers = 0;
    for (int count = 1; count <= n; count++) {
        System.out.println(number);
        sumOddNumbers += number;
        number += 2;
    }
    System.out.println("Sum: " + sumOddNumbers);
    }
}
