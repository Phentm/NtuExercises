package OOP.section2.AuthorBookOld;

public class Author {
    
    private String name, email;
    private char gender;
    
    public Author(String name, String email, char gender) {
        
        this.name = name;
        this.email = email;
        
        if (gender == 'm' || gender == 'f')
            this.gender = gender;
        else
            throw new IllegalArgumentException();
        
    }
    
    public String getName() { return name; }
    
    public String getEmail() { return email; } public void setEmail(String email) { this.email = email; }
    
    public char getGender() { return gender; }
    
    @Override
    public String toString() {
        return String.format("Author[name=%s,email=%s,gender=%c]", name, email, gender);
    }
    
}
