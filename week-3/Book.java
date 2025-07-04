public class Book {
  String name;

  Book(String name) {
    this.name = name;
  }

  Book(Book book) {
    this.name = book.name;
  }

  // Book() {}

  public static void main(String[] args) {
    Book mlt = new Book("mlt iitm bs");
    Book mlt2 = new Book(mlt);
    System.out.println(mlt2.name);
  }
}

