package Mid_Exam;

import java.util.*;
import java.util.stream.Collectors;

public class P02CoffeeLover {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int commands = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= commands; i++) {
            List<String> order = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

            String operation = order.get(0);
            switch (operation) {
                case "Include":
                    coffeeList.add(order.get(1));
                    break;
                case "Remove":
                    int number = Integer.parseInt(order.get(2));
                    if (number > coffeeList.size() - 1) {
                        break;
                    }
                    if (order.get(1).equals("first")) {
                        for (int j = 0; j < number; j++) {
                            coffeeList.remove(0);
                        }
                    } else {
                        int lastIndexToRemove = (coffeeList.size() - 1) - number;
                        for (int j = coffeeList.size() - 1; j > lastIndexToRemove; j--) {
                            coffeeList.remove(coffeeList.size() - 1);
                        }
                    }
                    break;
                case "Prefer":
                    int indexOne = Integer.parseInt(order.get(1));
                    int indexTwo = Integer.parseInt(order.get(2));

                    if ((coffeeList.size() - 1) >= indexOne && (coffeeList.size() - 1) >= indexTwo) {

                        String coffeeOne = coffeeList.get(indexOne);
                        String coffeeTwo = coffeeList.get(indexTwo);coffeeList.set(indexOne, coffeeTwo);
                        coffeeList.set(indexTwo, coffeeOne);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffeeList);
                    break;
            }
        }
        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffeeList));
    }
}
