package recursiontest;

import java.util.Scanner;

public class RecursionTest {
    public static void main(String[] args) {
        int[] recursiveArray = new int[13];
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a set of integers: ");
        // Loop to handle array entry
        for (int i = 0; i < recursiveArray.length; i++) {
            recursiveArray[i] = input.nextInt();
        }
        System.out.println("After analyzing all the numbers you entered the largest is " + getLargest(recursiveArray));
    }
    
    static int getLargest(int[] array) {
        return getLargest(array, 0, array[0]);
    }
    
    static int getLargest(int[] array, int i, int highest) {
        if (i == array.length) {
            return highest;
        }
        
        if (highest < array[i]) {
            highest = array[i];
        }
        
        return getLargest(array, i + 1, highest);
    }
}
