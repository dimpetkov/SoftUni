package BasicSyntaxCon_Lab;

import java.util.Scanner;

public class P01StudentInformation {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //1. read data
                //student name -> String
                //age -> int
                //average grade -> double
            //2. print text: "Name: {student name}, Age: {student age}, Grade: {student grade}"
        String studentName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", studentName, age, averageGrade);
    }
}
