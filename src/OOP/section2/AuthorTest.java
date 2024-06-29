package OOP.section2;

public class AuthorTest {

    public static void main(String[] args) {
        
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'f');
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());

        
    }

}
