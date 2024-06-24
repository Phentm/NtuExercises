package OOP.section1;

public class Account {
    
    private String id, name;
    private int balance;
    
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;
    }
    
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public int credit(int amount) {
        return balance += amount;
    }
    
    public int debit(int amount) {
        if (amount <= getBalance())
            balance -= amount;
        else
            System.out.println("Amount exceeded balance");
        return getBalance();
    }
    
    public int transferTo(Account another, int amount) {
        if (amount <= getBalance()) {
            another.credit(amount);
            balance -= amount;
        } else
            System.out.println("Amount exceeded balance");
            
        return getBalance();
    }
    
    @Override
    public String toString() {
        return "Account[id=" + getId() + ",name=" + getName() 
                + ",balance=" + getBalance() + "]";
    }
    
}
