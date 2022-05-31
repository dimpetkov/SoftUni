package BasicSyntaxCon_Lab;

import java.util.Scanner;

public class P02Passed {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //1.read the grade (double)
            //2. check if greater or lower then 3.00
            //3. print Passed
        double grade = Double.parseDouble(scanner.nextLine());
        if (grade >= 3.00) {
            System.out.println("Passed!");
        }
    }
}
