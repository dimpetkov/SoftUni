package ForCycles.Exercise;

import java.util.Scanner;

public class P06Salary {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int countTabs = Integer.parseInt(scanner.nextLine());
            int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countTabs; i++) {
            String websiteName = scanner.nextLine();

            switch (websiteName) {
                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary - 50;
                    break;
            }
            if (salary <= 0) {
                break;
            }
       }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}

