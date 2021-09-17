//	177A1 - Good Matrix Elements

import java.util.Scanner;

public class GoodMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int a = sc.nextInt();
                if (i == j || i + j == n + 1 || i == (n + 1) / 2 || j == (n + 1) / 2) {
                    sum += a;
                }
            }
        }

        sc.close();

        System.out.println(sum);
    }
}