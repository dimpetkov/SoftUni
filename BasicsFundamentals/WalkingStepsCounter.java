package ExerciseWhileLoop;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            int target = 10000;
            int stepsTotal = 0;
            while (!input.equals("Going home")) {
                int steps = Integer.parseInt(input);
                stepsTotal = stepsTotal + steps;

                if (stepsTotal >= target) {
                    break;
                }
                input = scanner.nextLine();
            }

            if (input.equals("Going home")) {
                int homeSteps = Integer.parseInt(scanner.nextLine());
                stepsTotal = stepsTotal + homeSteps;
            }
            int diff = Math.abs(target - stepsTotal);
            if (stepsTotal >= target) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", diff);
            } else {
                System.out.printf("%d more steps to reach goal.", diff);
            }
    }
}
