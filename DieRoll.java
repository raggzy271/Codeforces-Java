//	9 A

import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int y = sc.nextInt();
        int w = sc.nextInt();
        
        sc.close();
        
        int A = 7 - Math.max(y, w);   // favorable chances
        int B = 6;

        // Reducing A/B
        for (int i = 2; i <= A; i++) {
            if (A % i == 0 && B % i == 0) {
                A /= i;
                B /= i;
            }
        }
        
        System.out.println(A + "/" + B);
    }
}