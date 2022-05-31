package LabWhileLoop;

import java.util.Scanner;

public class P08GraduationPT2x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String student = scanner.nextLine();

        int years = 0;
        double countGrade = 0;
        double currentGrade = 0;
        int warnings = 0;
        while (warnings < 2 && years < 12) {

            currentGrade = scanner.nextDouble();
            countGrade = countGrade + currentGrade;
            years++;
            if (currentGrade < 4) {
                warnings++;
                currentGrade = scanner.nextDouble();
                countGrade = countGrade + currentGrade;
                years = years;
                if (currentGrade < 4) {
                    warnings++;
                    years = years;
                    break;
                }
            }
        }
        if (warnings > 1) {
            System.out.printf("%s has been excluded at %d grade%n", student, years);
        } else if (years == 12) {
            double averageGrade = countGrade / years;
            System.out.printf("%s graduated. Average grade: %.2f%n", student, averageGrade);
        }
    }
}
