import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        if (shape.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double areaSquare = a * a;
            System.out.printf("%.3f", areaSquare);
        } else if (shape.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double areaRectangle = a * b;
            System.out.printf("%.3f", areaRectangle);
        } else if (shape.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double areaCircle = Math.PI * r * r;
            System.out.printf("%.3f", areaCircle);
        } else if (shape.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double ha= Double.parseDouble(scanner.nextLine());
            double areaTriangle = a * ha / 2;
            System.out.printf("%.3f", areaTriangle);
        }
    }
}
