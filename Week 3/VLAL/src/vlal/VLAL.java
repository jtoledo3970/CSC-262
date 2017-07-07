package vlal;

public class VLAL {
    public static int prod(int... num) {
        int p = 1;
        for (int n:num) {
            p *= n;
        }
        return p;
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        int c = 10;
        int d = 12;
        int e = 14;
        System.out.printf("a = %d, b = %d, c = %d, d = %d, e = %d\n\n",a, b, c, d, e );
        System.out.printf("The product of a and b is:\t\t %d\t\n", prod(a, b));
        System.out.printf("The product of a, b and c is:\t\t %d\t\n", prod(a,b,c));
        System.out.printf("The product of a, b, c and d is:\t %d\t\n", prod(a,b,c,d));
        System.out.printf("The product of a, b, c, d and e is:\t %d\t\n", prod(a,b,c,d,e));
    }
}
