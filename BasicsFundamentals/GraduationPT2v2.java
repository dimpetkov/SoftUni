package LabWhileLoop;

import java.util.Scanner;

public class P08GraduationPT2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String student = scanner.nextLine();

            int years = 0;
            double countGrade = 0;
            boolean firstWarning = false;
            boolean secondWarning = false;

            while ((!firstWarning && !secondWarning) && years < 12) {

            double grades = Double.parseDouble(scanner.nextLine());
            countGrade = countGrade + grades;
            years++;

            if (grades < 4) {
                firstWarning = true;
                grades = scanner.nextDouble();
                countGrade = countGrade + grades;
                years = years;

                if (grades < 4) {
                    secondWarning = true;
                    years = years;
                } else {
                    firstWarning = false;
                }
            }
        }
        if (firstWarning && secondWarning) {
            System.out.printf("%s has been excluded at %d grade%n", student, years);
        } else if (years == 12) {
            double averageGrade = countGrade / years;
            System.out.printf("%s graduated. Average grade: %.2f%n", student, averageGrade);
        }
    }
}
