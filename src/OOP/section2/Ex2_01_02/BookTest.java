package OOP.section2.Ex2_01_02;

public class BookTest {

    public static void main(String[] args) {
        
        // Declare Authors list array
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book dummyBook = new Book("Java for dummy", authors, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()
        
        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthors()[0].toString());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthors()[0].getName());
        System.out.println("Author's email is: " + dummyBook.getAuthors()[0].getEmail());
        
        // Use an anonymous instance of Author to construct a Book instance
        Author[] author = {new Author("Paul Tan", "paul@somewhere.com", 'm')};
        Book anotherBook = new Book("more Java", author, 29.95);
        System.out.println(anotherBook);  // toString()
        
        System.out.println("-------------------------------------------------");
        
        // Getting data from an author of a book
        System.out.println(dummyBook.getAuthorNames());
        System.out.println(dummyBook.getAuthorEmails());
    }

}
