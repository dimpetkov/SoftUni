package FinalExam_5Dec;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P_MessageDecrypter {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
         Pattern pattern = Pattern.compile("^([%\\$])(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<first>\\d+)\\]\\|\\[(?<second>\\d+)\\]\\|\\[(?<third>\\d+)\\]\\|$");
         StringBuilder output = new StringBuilder();
         int counts = Integer.parseInt(scanner.nextLine());
         while(counts-->0) {
             Matcher matcher = pattern.matcher(scanner.nextLine());

             if (matcher.find()) {
                 String tag = matcher.group("tag");
                 char first = (char)Integer.parseInt(matcher.group("first"));
                 char second = (char)Integer.parseInt(matcher.group("second"));
                 char third = (char)Integer.parseInt(matcher.group("third"));

                 System.out.printf("%s: %c%c%c%n", tag, first, second, third);
             } else {
                 System.out.println("Valid message not found!");
             }
         }
    }
}
