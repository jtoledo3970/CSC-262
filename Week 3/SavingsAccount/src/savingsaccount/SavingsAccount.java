package savingsaccount;

class Savings {
    private static double annualInterestRate = 0;
    private double savingsBalance;
    
    public Savings(double balance) {
        savingsBalance = balance;
    }
    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * (annualInterestRate / 12.0);
    }
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = (newRate >= 0 && newRate <= 1.0) ? newRate:0.04;
    }
    public String toString() {
        return String.format("$%.2f", savingsBalance);
    }
}

public class SavingsAccount {
    public static void main(String[] args) {
       Savings a = new Savings (2000);
       Savings b = new Savings (3000);
       
       Savings.modifyInterestRate(0.04);
       
       System.out.println("Monthly balances for one year at 4%");      
       System.out.println("           Balances:");
       System.out.printf("%20s%10s\n", "Saver 1", "Saver 2");
       System.out.printf("%-10s%10s%10s\n", "Base", a.toString(), b.toString());
       
       for (int month = 1; month < 13; month++) {
           String ml = String.format("Month: %d", month);
           a.calculateMonthlyInterest();
           b.calculateMonthlyInterest();
           System.out.printf("%-10s%10s%10s\n", ml, a.toString(), b.toString());
       }
       Savings.modifyInterestRate(0.05);
       a.calculateMonthlyInterest();
       b.calculateMonthlyInterest();
       System.out.println("\nAfter setting the interest rate to 5%");
       System.out.println("            Balances:");
       System.out.printf("%-10s%10s\n", "Saver 1", "Saver 2");
       System.out.printf("%-10s%10s\n", a.toString(), b.toString());
    }
}
