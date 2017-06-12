import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        double withdrawalAmount;
        Account account1 = new Account("Jane Doe", 1000.00);
        System.out.println(account1.getName() + " balance: " + account1.getBalance());
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the amount that you would like to withdrawal: ");
        withdrawalAmount = in.nextDouble();
        System.out.printf("Subtracting %.2f from account balance%n", withdrawalAmount);
        account1.withdraw(withdrawalAmount);
        System.out.println(account1.getName() + "'s balance: " + account1.getBalance());
    }
    
}

class Account {
    private String name;
    private double balance;
    public Account (String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }
    
    public void deposit (double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }
    
    public void withdraw (double withdrawalAmount) {
        if (balance > withdrawalAmount) {
            balance = balance - withdrawalAmount;
        } else {
            System.out.println("Withdrawal amount exceeded account balance");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setName(String name) {
        this.name = name;
    } 
    
    public String getName() {
        return name;
    }
}
