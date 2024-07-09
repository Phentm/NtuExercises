package OOP.section2.Ex_01_02;

public class Book {
    
    private Author[] authors;
    private String name;
    private double price;
    private int qty;
    
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }
    
    public Book(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }
    
    public String getName() { return name; }
    
    public Author[] getAuthors() { return authors; }
    
    public double getPrice() { return price; } public void setPrice(double price) { this.price = price; }
    
    public int getQty() { return qty; } public void setQty(int qty) { this.qty = qty; }
    
    @Override
    public String toString() { 
        
        String authorsList = "{";
        
        if (authors.length > 0) authorsList += authors[0].toString();
        
        for (int i = 1; i < authors.length; i++)
            authorsList += "," + authors[i].toString();
        
        authorsList += "}";
        
        
        return String.format("Book[name=%s,authors=%s,price=%.2f,qty=%d]", name, authorsList, price, qty);
    }
    
    public String getAuthorNames() { 
        String names = "";
        
        if (authors.length > 0) names += authors[0].getName();
        
        for (int i = 1; i < authors.length; i++)
            names += "," + authors[i].getName();
        
        return names;
    }
    
    public String getAuthorEmails() {
        String emails = "";
        
        if (authors.length > 0) emails += authors[0].getEmail();
        
        for (int i = 1; i < authors.length; i++)
            emails += "," + authors[i].getEmail();
        
        return emails;
    }
    
    public String getAuthorGenders() {
        String genders = "";
        
        if (authors.length > 0) genders += authors[0].getName();
        
        for (int i = 1; i < authors.length; i++)
            genders += "," + authors[i].getGender();
        
        return genders;
    }
    
}
