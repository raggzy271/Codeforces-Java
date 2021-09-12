 // 214 A - System of Equations

import java.util.Scanner;

public class SystemOfEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int pairs = 0;
        for (int a = 0; a * a <= n && a <= m; a++) {
            int b = n - a * a;
            if (a + b * b == m) {
                pairs++;
            }
        }

        System.out.println(pairs);
    }
}
