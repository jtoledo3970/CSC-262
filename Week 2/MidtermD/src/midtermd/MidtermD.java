package midtermd;

public class MidtermD {
    public static void main(String[] args) {
        int t = 3;
        int n = 4;
        int m = 3;
        for (int h = 1; h <= n; h++) {
           for (int i = 1; i <= t; i++) {
               for (int k = 1; k <= m; k++) {
                    for (int j = 1; j <= (t - i); j++) {
                        System.out.print("   ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print(" * ");
                        if (i == 1) {
                            System.out.print("   ");
                        }
                    }
                    for (int j = i - 2; j >= 0; j--) {
                        System.out.print(" * ");
                        if (i == 3) {
                            // System.out.print(" ");
                        } else if(i == 2) {
                            // System.out.print("  ");
                        }
                    }
               }
               System.out.println();
            }  
        } 
    }
}
