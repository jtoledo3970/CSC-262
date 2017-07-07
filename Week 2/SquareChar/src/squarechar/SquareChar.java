package squarechar;

import java.util.Scanner;

public class SquareChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        char c;
        System.out.print("Please enter a number: ");
        n = input.nextInt();
        System.out.print("Please enter a character: ");
        c = input.next().charAt(0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + c + " ");
            }
            System.out.println();
        }
    }
}
