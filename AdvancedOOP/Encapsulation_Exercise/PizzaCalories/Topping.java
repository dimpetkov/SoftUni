package Encapsulation_Exercise.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    public void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies")
                || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else {
            String message = "Cannot place " + toppingType + " on top of your pizza.";
            throw new IllegalArgumentException(message);
        }
    }

    public void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw  new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
    }

    public double calculateCalories() {
        double toppingCoefficient = switch (toppingType) {
            case "Meat" -> 1.2;
            case "Veggies" -> 0.8;
            case "Cheese" -> 1.1;
            case "Sauce" -> 0.9;
            default -> 0;
        };
        return 2 * weight * toppingCoefficient;
    }
}
