package taylorrecursion;

public class TaylorRecursion {
    
    public static void main(String[] args) {
        int n = 10;
        float x = 4.0f;
        System.out.printf("e^x = %f", exponential(n,x));
    }
    
    public static float exponential(int n, float x) {
        float sum = 1.0f;
        for (int i = n - 1; i > 0; --i) {
            sum = 1 + x * sum / i;
        }
        return sum;
    }
}
