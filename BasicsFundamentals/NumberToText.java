import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.printf("Please enter a number from 1 to 9'999%n");
            String input = scanner.nextLine();
            int a = Integer.parseInt(String.valueOf(input.charAt(0)));
            int b = Integer.parseInt(String.valueOf(input.charAt(1)));
            int c = Integer.parseInt(String.valueOf(input.charAt(2)));
            int d = Integer.parseInt(String.valueOf(input.charAt(3)));

            String thousands = "";
            String hundreds = "";
            String tens = "";
            String units = "";

            switch (a) {
                case 0:
                    thousands = " ";
                    break;
                case 1:
                    thousands = "One thousand";
                    break;
                case 2:
                    thousands = "Two thousand";
                    break;
                case 3:
                    thousands = "Three thousand";
                    break;
                case 4:
                    thousands = "Four thousand";
                    break;
                case 5:
                    thousands = "Five thousand";
                    break;
                case 6:
                    thousands = "Six thousand";
                    break;
                case 7:
                    thousands = "Seven thousand";
                    break;
                case 8:
                    thousands = "Eight thousand";
                    break;
                case 9:
                    thousands = "Nine thousand";
                    break;
            }
        switch (b) {
            case 0:
                hundreds = " ";
                break;
            case 1:
                hundreds = "one hundred";
                break;
            case 2:
                hundreds = "two hundred";
                break;
            case 3:
                hundreds = "three hundred";
                break;
            case 4:
                hundreds = "four hundred";
                break;
            case 5:
                hundreds = "five hundred";
                break;
            case 6:
                hundreds = "six hundred";
                break;
            case 7:
                hundreds = "seven hundred";
                break;
            case 8:
                hundreds = "eight hundred";
                break;
            case 9:
                hundreds = "nine hundred";
                break;
        }
        switch (c) {
            case 0:
                tens = " ";
                break;
            case 1:
                switch (d) {
                    case 0:
                        tens = "ten";
                        break;
                    case 1:
                        tens = "eleven";
                        break;
                    case 2:
                        tens = "twelve";
                        break;
                    case 3:
                        tens = "thirteen";
                        break;
                    case 4:
                        tens = "fourteen";
                        break;
                    case 5:
                        tens = "fifteen";
                        break;
                    case 6:
                        tens = "sixteen";
                        break;
                    case 7:
                        tens = "seventeen";
                        break;
                    case 8:
                        tens = "eighteen";
                        break;
                    case 9:
                        tens = "nineteen";
                        break;
                }
            System.out.printf("%s %s and %s", thousands, hundreds, tens);
            return;
            case 2:
                tens = "twenty";
                break;
            case 3:
                tens = "thirty";
                break;
            case 4:
                tens = "forty";
                break;
            case 5:
                tens = "fifty";
                break;
            case 6:
                tens = "sixty";
                break;
            case 7:
                tens = "seventy";
                break;
            case 8:
                tens = "eighty";
                break;
            case 9:
                tens = "ninety";
                break;
        }
        switch (d) {
            case 0:
                units = " ";
                break;
            case 1:
                units = "one";
                break;
            case 2:
                units = "two";
                break;
            case 3:
                units = "three";
                break;
            case 4:
                units = "four";
                break;
            case 5:
                units = "five";
                break;
            case 6:
                units = "six";
                break;
            case 7:
                units = "seven";
                break;
            case 8:
                units = "eight";
                break;
            case 9:
                units = "nine";
                break;
        }
        System.out.printf("%s %s and %s %s", thousands, hundreds, tens, units);
    }
}
