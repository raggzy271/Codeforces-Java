//	47 - A

import java.util.Scanner;

public class TriangularNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        sc.close();
        
        // For n to be a triangular number, n = x(x + 1)/2 where x is a whole number
        // This means that -> x^2 + x - 2n = 0
        // If x is a whole number, then n is a triangular number

        double x1 = -1 + Math.sqrt(1 + 8 * n);
        double x2 = -1 - Math.sqrt(1 + 8 * n);

        if (Math.floor(x1) == x1 || Math.floor(x2) == x2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}