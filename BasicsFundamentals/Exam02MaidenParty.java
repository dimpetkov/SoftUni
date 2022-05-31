package ExamJuly2020;

import java.util.Scanner;

public class P02MaidenParty {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        //love message - 0.60
        //Wax Rose - 7.20
        //Key Chain - 3.60
        //Cartoon - 18.20
        //Lucky surprise - 22
        //25 or more -> 35% discount
        //10% hosting cost (minus)
        double partyPrice = Double.parseDouble(scanner.nextLine());
        int loveMessages = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keyChain = Integer.parseInt(scanner.nextLine());
        int cartoon = Integer.parseInt(scanner.nextLine());
        int luckySurprise = Integer.parseInt(scanner.nextLine());
        //25 or more -> 35% discount
        //10% hosting cost (minus)
        double incomeGross = (loveMessages * 0.6) + (waxRoses * 7.20) + (keyChain * 3.60) + (cartoon * 18.20) + (luckySurprise * 22);
        double itemsCount = loveMessages + waxRoses + keyChain + cartoon + luckySurprise;
        if (itemsCount >= 25) {
            incomeGross = incomeGross * 0.65;
        }
        double total = incomeGross * 0.9;
        if (total >= partyPrice) {
            System.out.printf("Yes! %.2f lv left.", total - partyPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", partyPrice - total);
        }
    }
}
