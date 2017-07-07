package midtermd2;

public class MidtermD2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("N = " + n);
        // First Section
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < (5*n); i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // Second Section
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < (5*n); i++) {
                if (i >= 0 && i < n || i >= ((5*n)-n) && i <= (5*n)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        // Third Section
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < (5*n); i++) {
                if (i >= 0 && i < n || i >= (n*2) && i < (n*3) || i >= ((5*n)-n) && i <= (5*n)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        // Fourth Section
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < (5*n); i++) {
                if (i >= 0 && i < n || i >= ((5*n)-n) && i <= (5*n)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        // Fifth Section
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < (5*n); i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
