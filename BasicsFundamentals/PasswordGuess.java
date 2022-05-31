import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompt for a password text (s3cr3t!P@ssw0rd)
        String password = scanner.nextLine();
        // s3cr3t!P@ssw0rd
        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
