//	158A - Next Round

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        int min = 0;
        int advanced = 0;

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if (a <= 0) {
                break;
            }

            if (i == k) {
                min = a;
            }

            if (i <= k) {
                advanced++;
            }
            else if (a == min) {
                advanced++;
            }
        }
        
        sc.close();
        
        System.out.println(advanced);
    }
}