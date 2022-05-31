package MoreExercise;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String start = scanner.nextLine();
            String end = scanner.nextLine();
            String excluding = scanner.nextLine();

            char a = start.charAt(0);
            char b = end.charAt(0);
            char ex = excluding.charAt(0);

            int count = 0;
        for (char i = a; i <= b ; i++) {
            for (char j = a; j <= b ; j++) {
                for (char k = a; k <= b; k++) {
                    if (i != ex && j != ex && k != ex) {
                        System.out.printf("%c%c%c ", i, j, k);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
