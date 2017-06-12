package employeetest;

final class Employee {
    // The three instance var
    private String firstName, lastName;
    private double monthlySalary;
    // Constructor
    public Employee (String firstName, String lastName, double monthlySalary) {
        // Initilization
        setFirstName(firstName);
        setLastName(lastName);
        setMonthlySalary(monthlySalary);
    }
    
    // Accesors and Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setMonthlySalary(double salary) {
        if (salary > 0) {
            this.monthlySalary = salary;
        } else {
            System.out.println("Invalid entry: the salary should be a positive number");
        }
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public double getMonthlySalary() {
        return monthlySalary;
    } 
}

public class EmployeeTest {
    public static void main(String[] args) {
       Employee employeeA = new Employee("Jose", "Toledo", 82000.00);
       Employee employeeB = new Employee("Tim", "Cook", 100289.00);
       System.out.println("This is your first employee's information");
       System.out.println("-----------------------------------------");
       System.out.println("First name: " + employeeA.getFirstName() + "\nLast Name: " + employeeA.getLastName() + "\nMonthlySalary: $" + employeeA.getMonthlySalary() + "\nYearly Salary: $" + (employeeA.getMonthlySalary()*12) + "\nNow we will give " + employeeA.getFirstName() + " a raise of 10% which comes out to: " + (((employeeA.getMonthlySalary() * 1.1))*12));
       System.out.println("-----------------------------------------");
       System.out.println("This is your second employee's information");
       System.out.println("-----------------------------------------");
       System.out.println("First name: " + employeeB.getFirstName() + "\nLast Name: " + employeeB.getLastName() + "\nMonthlySalary: $" + employeeB.getMonthlySalary() + "\nYearly Salary: $" + (employeeB.getMonthlySalary()*12) + "\nNow we will give " + employeeB.getFirstName() + " a raise of 10% which comes out to: " + (((employeeB.getMonthlySalary() * 1.1))*12));
    }
}
