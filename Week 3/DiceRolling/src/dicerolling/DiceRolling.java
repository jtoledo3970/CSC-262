package dicerolling;

public class DiceRolling {
    public static void main(String[] args) {
        int rolls = 36000000;
        int size = 13;
        int x, y;
        int []sum = new  int[size];
        for (int i = 1; i <= rolls; ++i) {
            x = (int)(1 + Math.random() * 6);
            y = (int)(1 + Math.random() * 6);
            ++sum[x+y];
        }
        System.out.printf("If a pair of dice are rolled %d times this is the random outcome\n", rolls);
        System.out.println("Sum\tTotal\t");
        for (int j = 2; j < size; j++) {
            System.out.println(j + "\t" + sum[j] + "\t");
        }
    }
}
