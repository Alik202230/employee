package classwork.library;

public class BookDatabase {
  private Book[] books = new Book[2];
  private int size = 0;

  public void add(Book book) {
    if (size == books.length) {
      resize();
    }
    books[size++] = book;
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.println(STR."\{books[i].getTitle()} \{books[i].getAuthor()} \{books[i].getPrice()} \{books[i].getQuantity()}");
    }
  }

  public void search(String name) {
    for (int i = 0; i < size; i++) {
      if (books[i].getTitle().contains(name) || books[i].getAuthor().contains(name)) {
        System.out.println(STR."\{books[i].getTitle()} \{books[i].getAuthor()} \{books[i].getPrice()} \{books[i].getQuantity()}");
      }
    }
  }

  private void resize() {
    Book[] temp = new Book[books.length + 1];
    for (int i = 0; i < size; i++) {
      temp[i] = books[i];
    }
    books = temp;
  }

}
