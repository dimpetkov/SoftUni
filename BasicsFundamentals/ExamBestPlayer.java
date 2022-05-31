import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String player = scanner.nextLine();


            int maxScore = Integer.MIN_VALUE;
            String bestPlayer = player;
            while (!player.equals("END")) {
                int score = Integer.parseInt(scanner.nextLine());

                if (score >= 10) {
                    maxScore = score;
                    bestPlayer = player;
                    break;
                } else if (score > maxScore) {
                    maxScore = score;
                    bestPlayer = player;
                }
                player = scanner.nextLine();
            }
        System.out.printf("%s is the best player!%n", bestPlayer);
            if (maxScore >= 3) {
                System.out.printf("He has scored %d goals and made a hat-trick !!!", maxScore);
            } else {
                System.out.printf("He has scored %d goals.", maxScore);
            }
    }
}
