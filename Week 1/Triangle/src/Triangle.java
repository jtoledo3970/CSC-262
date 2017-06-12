import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double side1, side2, side3;
        Scanner in = new Scanner(System.in);
        System.out.println("You will now enter three nonzero values");
        // Three sides
        System.out.println("Enter side 1: ");
        side1 = in.nextDouble();
        System.out.println("Enter side 2: ");
        side2 = in.nextDouble();
        System.out.println("Enter side 3: ");
        side3 = in.nextDouble();
        
        // Test of the triangle
        if (side1 + side2 > side3) {
            if (side1 + side3 > side2) {
                if (side2 + side3 > side1) {
                    System.out.println("Those numbers can be the sides of a triangle");
                } else {
                    System.out.println("These cannot be the sides of a triangle.");
                }
            } else {
                System.out.println("These cannot be the sides of a triangle.");
            }
        }
    }
}
