package BasicSyntaxCon_Lab;

import java.util.Scanner;

public class P06ForeignLanguages {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // read a country
            //1.English -> England and USA
            //2.Spanish -> Spain, Argentina and Mexico
            //3.Others -> "unknown"
            String country = scanner.nextLine();
        if ("USA".equalsIgnoreCase(country) || "England".equalsIgnoreCase(country)) {
            System.out.println("English");
        } else if ("Spain".equalsIgnoreCase(country) || "Argentina".equalsIgnoreCase(country) || "Mexico".equals(country)) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
