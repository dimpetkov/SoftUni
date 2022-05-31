package MoreExerciseWhileLoop;

import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int c = 0;
        int o = 0;
        int n = 0;
        String word = "";
        while (!input.equals("End")) {
            if (input.length() == 1) {
                char x = input.charAt(0);
                if (Character.isAlphabetic(x)) {
                    if (input.equals("c") && c == 0) {
                        c++;
                    } else if (input.equals("o") && o == 0) {
                        o++;
                    } else if (input.equals("n") && n == 0) {
                        n++;
                    } else {
                        word = word + x;
                    }
                    if (c ==1 && o == 1 && n == 1) {
                        System.out.printf("%s ", word);
                        word = "";
                        c = 0;
                        o = 0;
                        n = 0;
                    }
                }
            }
            input = scanner.nextLine();
        }
    }
}
