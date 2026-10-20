package Bai2.Bai2_2;

public class Main {
    static void main(String[] args) {
        Author[] authors = new Author[2];

        authors[0] = new Author(
                "Tan Ah Teck", "ahteck@gmail.com", 'm');

        authors[1] = new Author(
                "Paul Tan", "paul@gmail.com", 'm');

        Book book = new Book(
                "Java for Dummy", authors, 19.99, 99);

        System.out.println(book);
        System.out.println("Book name: " + book.getName());
        System.out.println("Authors: " + book.getAuthorNames());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity: " + book.getQty());

        book.setPrice(25.50);
        book.setQty(50);

        System.out.println("Updated book: " + book);
    }
}
