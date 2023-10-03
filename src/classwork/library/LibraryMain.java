package classwork.library;

import java.util.Scanner;

public class LibraryMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BookDatabase database = new BookDatabase();
    boolean isRunning = true;

    while (isRunning) {
      System.out.println("Please enter 0 for exit");
      System.out.println("Please enter 1 for add");
      System.out.println("Please enter 2 for search");
      System.out.println("Please enter 3 for all books");
      String command = scanner.nextLine();

      switch (command) {
        case "0" -> isRunning = false;
        case "1" -> {
          System.out.println("Please enter book title");
          String title = scanner.nextLine();
          System.out.println("Please enter author name");
          String author = scanner.nextLine();
          System.out.println("Please enter price");
          double price = Double.parseDouble(scanner.nextLine());
          System.out.println("Please enter quantity");
          int quantity = Integer.parseInt(scanner.nextLine());
          Book book = new Book(title, author, price, quantity);
          database.add(book);
          System.out.println("Book is created");
        }
        case "2" -> {
          System.out.println("Search by author name");
          String search = scanner.nextLine();
          database.search(search);
        }
        case "3" -> {
          System.out.println("=============");
          database.print();
          System.out.println("=============");
        }
      }
    }
  }
}
