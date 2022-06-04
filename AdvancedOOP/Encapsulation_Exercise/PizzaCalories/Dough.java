package Encapsulation_Exercise.PizzaCalories;

public class Dough {
    private String flourType; //validate: white, wholegrain
    private String bakingTechnique; //validate: crispy, chewy, homemade
    private double weight; //validate: [1; 200]

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double calculateCalories() {
        double flourTypeCoefficient = 0;
        if (flourType.equals("White")) {
            flourTypeCoefficient = 1.5;
        } else if (flourType.equals("Wholegrain")) {
            flourTypeCoefficient = 1;
        }
        double bakingTechniqueTypeCoefficient = switch (bakingTechnique) {
            case "Crispy" -> 0.9;
            case "Chewy" -> 1.1;
            case "Homemade" -> 1.0;
            default -> 0;
        };
        return 2 * this.weight * flourTypeCoefficient * bakingTechniqueTypeCoefficient;
    }
}
