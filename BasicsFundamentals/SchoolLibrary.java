package Mid_Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03SchoolLibrary {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        List<String> books = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());
        String input = scanner.nextLine();
        boolean check = false;
        String checkBook = "";
        while (!input.equals("Done")) {
            List<String> command = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
            String commandString = command.get(0);
            String toDo = command.get(0);

            switch (toDo) {
                case "Add Book ":
                    String addBook = command.get(1).trim();
                    if (!books.contains(addBook)) {
                        books.add(0,addBook);
                    }
                    break;
                case "Take Book ":
                    String takeBook = command.get(1).trim();
                    books.remove(takeBook);
                    break;
                case "Swap Books ":
                    String bookOne = command.get(1).trim();
                    String bookTwo = command.get(2).trim();
                    if (books.contains(bookOne) && books.contains(bookTwo)) {
                        int indexOne = books.indexOf(bookOne);
                        int indexTwo = books.indexOf(bookTwo);
                        books.set(indexOne, bookTwo);
                        books.set(indexTwo, bookOne);
                    }
                    break;
                case "Insert Book ":
                    String insertBook = command.get(1).trim();
                    if (!books.contains(insertBook)) {
                        books.add(insertBook);
                    }
                    break;
                case "Check Book ":
                    int checkIndex = Integer.parseInt(command.get(1).trim());
                    if ((books.size() - 1) >= checkIndex) {
                        checkBook = books.get(checkIndex);
                        check = true;
                    }
                    break;
            }

            input = scanner.nextLine();

        }
        if (check) {
            System.out.println(checkBook);
        }
        System.out.println(String.join(", ", books));

    }

}
