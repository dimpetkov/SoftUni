package LabWhileLoop;

import java.util.Scanner;

public class P01ReadText {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //initial value
            //read a text from the console + print the text
            //read new value
            //stop when read text "stop"
            //continue cycle while read diff than "stop";
        String text = scanner.nextLine();
        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine(); // the variable gets the value of the new text value
        }
    }
}
