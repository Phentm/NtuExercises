package OOP.section1;

public class Employee {
    
    private final int ID;
    private int salary;
    private final String firstName, lastName;
    
    public Employee(int ID, String firstName, String lastName, int salary) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public int getId() {
        return ID;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getName() {
        return getFirstName() + " " + getLastName();
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getAnnualSalary() {
        return salary * 12;
    }
    
    public int raiseSalary(int percent) {
        return salary *= (100+percent)/100.0;
    }
    
    @Override
    public String toString() {
        return "Employee[id=" + getId() + ",name=" + getName() 
                + ",salary=" + getSalary() + "]";
    }
    
}
