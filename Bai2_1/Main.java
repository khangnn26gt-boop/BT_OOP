package Bai2.Bai2_1;

public class Main {
    static void main(String[] args) {
        Author ahTeck = new Author(
                "Tan Ah Teck",
                "ahteck@nowhere.com",
                'm'
        );

        System.out.println(ahTeck);

        // Test constructor co qty
        Book dummyBook = new Book(
                "Java for dummy", ahTeck, 19.95, 99
        );

        System.out.println(dummyBook);

        // Test getters va setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);

        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());

        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: "
                + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: "
                + dummyBook.getAuthor().getEmail());

        // Test cac phuong thuc mo rong
        System.out.println("Author name: "
                + dummyBook.getAuthorName());
        System.out.println("Author email: "
                + dummyBook.getAuthorEmail());
        System.out.println("Author gender: "
                + dummyBook.getAuthorGender());

        // Test constructor khong co qty
        Book anotherBook = new Book(
                "more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'),
                29.95
        );

        System.out.println(anotherBook);
    }
}
