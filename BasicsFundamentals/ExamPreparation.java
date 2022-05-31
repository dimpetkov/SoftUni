package ExerciseWhileLoop;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int maxLowGrades = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();

            int countLowGrade = 0;
            int problemsCount = 0;
            double gradeCount = 0;
            String lastProblem = "";
            while (!input.equals("Enough")) {

                int grade = Integer.parseInt(scanner.nextLine());

                if (grade <= 4) {
                    countLowGrade++;
                }
                if (countLowGrade >= maxLowGrades) {
                    break;
                }
                problemsCount++;
                gradeCount = gradeCount + grade;
                lastProblem = input;
                input = scanner.nextLine();
            }
            if (countLowGrade == maxLowGrades) {
                System.out.printf("You need a break, %d poor grades.%n", countLowGrade);
            } else {
                System.out.printf("Average score: %.2f%n", gradeCount/problemsCount);
                System.out.printf("Number of problems: %d%n", problemsCount);
                System.out.printf("Last problem: %s%n", lastProblem);
            }
    }
}
