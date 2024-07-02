package OOP.section2.Ex2_05;

public class Account {
    
    private int id;
    private Customer customer;
    private double balance;
    
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }
    
    public Account(int id, Customer customer, double balance) {
        this(id, customer);
        this.balance = balance;
    }

    public int getId() { return id; }

    public Customer getCustomer() { return customer; }

    public double getBalance() { return balance; }
    
    public void setBalance(double balance) { this.balance = balance; }
    
    @Override
    public String toString() {
        return String.format("%s balance=%.2f", customer.toString(), balance);
    }
    
    public String getCustomerName() { return customer.getName(); }
    
    public Account deposit(double amount) {
        balance += amount;
        return this;
    }
    
    public Account withdraw(double amount) {
        if (amount > balance)
            System.err.println("Amount withdrawn exceedes the current balance!");
        else
            balance -= amount;
        return this;
    }
    
}
