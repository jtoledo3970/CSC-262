package squareasterisk;

import java.util.Scanner;

public class SquareAsterisk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Please enter a number: ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }    
}
