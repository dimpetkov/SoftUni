import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int lorriesCount = Integer.parseInt(scanner.nextLine());

        //1. total income = puzzles amount(numbers * 2.60) + dolls amount(number*3.00)
        // + bears amount(number*4.10) + minion amount(number*8.20)
        // + trucks amount(number*2)
        double totalPrice = (puzzlesCount * 2.60) + (dollsCount * 3) + (teddyBearsCount * 4.10) + (minionsCount * 8.20) + (lorriesCount * 2);
        int countToys = puzzlesCount + dollsCount + teddyBearsCount + minionsCount + lorriesCount;

        //2. check for discount (number puzzles+number dolls+number bears
        // +number minions + number trucks),
        // if bigger than 50
        if (countToys >= 50) {
            totalPrice = totalPrice * 0.75;
        }
        //3. rent (income after discount - 10% for rent)
        totalPrice = totalPrice * 0.90;

        //4. if the remaining is enough (check if > or = price for the trip)
        if (totalPrice >= tripPrice) {
            double leftMoney = totalPrice - tripPrice;
            System.out.printf("Yes! %.2f lv left.", leftMoney);
        } else {
            //total money not enough
            double needMoney = tripPrice - totalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", needMoney);
        }
    }
}
