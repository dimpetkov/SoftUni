package CondStatementAdvancedExecrise;

import java.util.Scanner;

public class MyNewHouse {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String flowers = scanner.nextLine();
            int countFlowers = Integer.parseInt(scanner.nextLine());
            int budget = Integer.parseInt(scanner.nextLine());
            //flower types: Roses, Dahlias, Tulips, Narcissus, Gladiolus
        double rosesPrice = 5.00;
        double dahliasPrice = 3.80;
        double tulipsPrice = 2.80;
        double narcissusPrice = 3.00;
        double gladiolusPrice = 2.50;
        double price = 0.00;
        double discount = 0.00;

        switch (flowers) {
            case "Roses": //повече от 80 Рози - 10% отстъпка от крайната цена
                price = rosesPrice;
                if (countFlowers > 80) {
                    discount = -0.10;
                }
                break;
            case "Dahlias": //повече от 90  Далии - 15% отстъпка от крайната цена
                price = dahliasPrice;
                if (countFlowers > 90) {
                    discount = -0.15;
                }
                break;
            case "Tulips": //повече от 80 Лалета - 15% отстъпка от крайната цена
                price = tulipsPrice;
                if (countFlowers > 80) {
                    discount = -0.15;
                }
                break;
            case "Narcissus": //по-малко от 120 Нарциса - цената се оскъпява с 15%
                price = narcissusPrice;
                if (countFlowers < 120) {
                    discount = 0.15;
                }
                break;
            case "Gladiolus": //по-малко от 80 Гладиоли - цената се оскъпява с 20%
                price = gladiolusPrice;
                if (countFlowers < 80) {
                    discount = 0.20;
                }
                break;
        }
        double grossTotal = countFlowers * price;
        double netTotal = grossTotal + grossTotal * discount;
        double result = budget - netTotal;
        if (result >= 0) {
            System.out.printf("Hey, you have a great garden with %d %s and %.02f leva left.", countFlowers, flowers, result);
        } else {
            System.out.printf("Not enough money, you need %.02f leva more.", Math.abs(result));
        }
    }
}
