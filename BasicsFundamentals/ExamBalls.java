import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

        int score = 0;
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int others = 0;
        for (int i = 1; i <= n; i++) {
            String colour = scanner.nextLine();
            switch (colour) {
                case "red":
                    score +=5;
                    red++;
                    break;
                case "orange":
                    score +=10;
                    orange++;
                    break;
                case "yellow":
                    score +=15;
                    yellow++;
                    break;
                case "white":
                    score +=20;
                    white++;
                    break;
                case "black":
                    score /=2;
                    black++;
                    break;
                default:
                    others++;
                    score = score;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", score);
        System.out.printf("Points from red balls: %d%n", red);
        System.out.printf("Points from orange balls: %d%n", orange);
        System.out.printf("Points from yellow balls: %d%n", yellow);
        System.out.printf("Points from white balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n", others);
        System.out.printf("Divides from black balls: %d%n", black);
    }
}
