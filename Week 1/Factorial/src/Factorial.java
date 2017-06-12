import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int integer, factorial;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a non-negative number: ");
        integer = in.nextInt();
        while (integer < 0) {
            System.out.println("Please enter a non-negative number: ");
            integer = in.nextInt();
        }
        
        if (integer == 0) {
            System.out.println("The factorial value of 0 is 1");
        } else {
            factorial = 1;
            for(int counter = integer; counter >= 1; counter--) {
                factorial = factorial * counter;
            }
            System.out.println(integer + "!: " + factorial);
        }
    }
}
