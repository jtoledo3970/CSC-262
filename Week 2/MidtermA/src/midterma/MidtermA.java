package midterma;

import java.util.Scanner;

public class MidtermA {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        x = input.nextDouble();
        System.out.print("Please enter your first number: ");
        y = input.nextDouble();
        System.out.print("Please enter your first number: ");
        z = input.nextDouble();
        
        double absY = Math.abs(y);
        double zF = Math.pow(z,4);
        double yT = Math.pow(y, 3);
        double pT = Math.pow(x,2) - y;
        double firstPart = Math.sqrt((x*x)+(Math.pow(absY, 3)));
        double secondPart = Math.sqrt((y)-(1/x));
        double thirdPart = zF + yT + Math.pow(pT, 3) - 11;

        // This is the actual equation
        System.out.println((firstPart + secondPart)/thirdPart);
    }
    
}
