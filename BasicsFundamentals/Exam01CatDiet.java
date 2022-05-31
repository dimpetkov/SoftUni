package ExamJuly2020;

import java.util.Scanner;

public class P01CatDiet {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int fatPercent = Integer.parseInt(scanner.nextLine());
            int proteinsPercent = Integer.parseInt(scanner.nextLine());
            int carbonsPercent = Integer.parseInt(scanner.nextLine());
            int cals = Integer.parseInt(scanner.nextLine());
            int waterPercent = Integer.parseInt(scanner.nextLine());

        //1 gr fat = 9 cals
        //1 gr proteins = 4 cals
        //1 gr carbons = 4 cals
            double fatGrams = (cals * 1.0 * fatPercent / 100) / 9;
            double proteinsGrams = (cals * 1.0 * proteinsPercent / 100) / 4;
            double carbonGrams = (cals * 1.0 * carbonsPercent / 100) / 4;
            double foodGrams = fatGrams + proteinsGrams + carbonGrams;
            double calsPerGramWet = cals / foodGrams;
            double calsPerGramDry = calsPerGramWet - calsPerGramWet * waterPercent / 100;
        System.out.printf("%.4f", calsPerGramDry);
    }
}
