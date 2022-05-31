package FinalExam_5Dec;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class WildZoo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            Map<String, Integer> animals = new TreeMap<>();
            Map<String, Integer> areasInfo = new TreeMap<>();
            Map<String, String> animalsInAreas = new LinkedHashMap<>();
            while (!input.equals("EndDay")) {
                String[] inputArr = input.split(": ");
                String command = inputArr[0];
                String[] data = inputArr[1].split("-");
                String animalName = data[0];
                switch (command) {
                    case "Add":
                        int neededFoodQuantity = Integer.parseInt(data[1]);
                        String area = data[2];
                        if (animalsInAreas.containsKey(animalName)) {
                            if (animalsInAreas.get(animalName).equals(area)) {
                                areasInfo.put(area, areasInfo.get(area)-1);
                            }
                        }
                        if (animals.containsKey(animalName)) {
                            int newValue = animals.get(animalName) + neededFoodQuantity;
                            animals.put(animalName, newValue);
                        }
                        animals.putIfAbsent(animalName, neededFoodQuantity);
                        if (areasInfo.containsKey(area)) {
                            areasInfo.put(area, areasInfo.get(area) + 1);
                        }
                        areasInfo.putIfAbsent(area, 1);
                        animalsInAreas.putIfAbsent(animalName, area);
                        break;
                    case "Feed":
                        int food = Integer.parseInt(data[1]);
                        if (animals.containsKey(animalName)) {
                            int neededFood = animals.get(animalName) - food;
                            if (neededFood <= 0) {
                                System.out.println(animalName + " was successfully fed");
                                animals.remove(animalName);
                                String areaToCheck = animalsInAreas.get(animalName);
                                areasInfo.put(areaToCheck, areasInfo.get(areaToCheck) - 1);
                                if (areasInfo.get(areaToCheck) == 0) {
                                    areasInfo.remove(areaToCheck);
                                }
                            } else {
                                animals.put(animalName, neededFood);
                            }
                        }
                        break;
                }
                input = scanner.nextLine();
            }
            System.out.println("Animals:");
            animals
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(comparingByValue()))
                    .forEach(animal -> System.out.println(" " + animal.getKey() + " -> " + animal.getValue() + "g"));
            System.out.println("Areas with hungry animals:");
            areasInfo.entrySet().stream().sorted(Collections.reverseOrder(comparingByValue()))
                    .forEach(area -> System.out.println(" " + area.getKey() + ": " + area.getValue() + ""));
        }
    }

