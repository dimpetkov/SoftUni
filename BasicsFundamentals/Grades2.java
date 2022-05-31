package ForCycles.ForCyclesMoreExercise;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            double topStudent = 0;
            double goodStudents = 0;
            double averageStudents = 0;
            double badStudents = 0;
            double gradesCount = 0;
        for (int i = 1; i <= n; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            gradesCount = gradesCount + grade;
            if (grade >= 2.00 && grade <= 2.99) {
                badStudents++;
            } else if (grade >= 3.00 && grade <= 3.99) {
                averageStudents++;
            } else if (grade >= 4.00 && grade <= 4.99) {
                goodStudents++;
            } else {
                topStudent++;
            }
        }
        double averageGrade = gradesCount/n;
        double topPercent = topStudent / n * 100;
        double goodPercent = goodStudents / n * 100;
        double averagePercent = averageStudents / n * 100;
        double badPercent = badStudents / n * 100;
        System.out.printf("Top students: %.2f%%%n", topPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", goodPercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", averagePercent);
        System.out.printf("Fail: %.2f%%%n", badPercent);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
