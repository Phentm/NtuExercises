package OOP.section2.Ex_05;

public class TestMain {

    public static void main(String[] args) {
        
        // Testing Customer class
        Customer c1 = new Customer(1, "Max Yakovlev", 'm');
        System.out.println(c1);
        System.out.println("Id is: " + c1.getId());
        System.out.println("Name is: " + c1.getName());
        System.out.println("Gender is: " + c1.getGender());
        
        System.out.println("-------------------------------------------------");
        
        // Testing Account class
        Account acc1 = new Account(c1.getId()+1000, c1);
        System.out.println(acc1);
        Account acc2 = new Account(1002, new Customer(2, "Female name", 'f'), 99.99);
        System.out.println(acc2);
        
        System.out.println("Id is: " + acc1.getId());
        System.out.println("Customer is: " + acc1.getCustomer());
        System.out.println("Balance is: " + acc1.getBalance());
        acc1.setBalance(105.5);
        System.out.println("Balance is: " + acc1.getBalance());
        System.out.println("Customer name is: " + acc1.getCustomerName());
        System.out.println(acc1.deposit(4.5));
        System.out.println(acc1.withdraw(200));
        System.out.println(acc1.withdraw(50));
        
    }

}
