package OOP.section2.Ex2_03;

public class Author {
    
    private String name, email;
    
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public String getName() { return name; }
    
    public String getEmail() { return email; }
    
    public void setEmail(String email) { this.email = email; }
    
    @Override
    public String toString() {
        return String.format("Author[name=%s,email=%s]", name, email);
    }
    
}
