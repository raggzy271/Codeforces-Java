//	1399A - Remove Smallest

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int j = 0; j < n; j++) {
                A[j] = sc.nextInt();
            }

            Arrays.sort(A);
            boolean no = false;

            for (int j = 1; j < n; j++) {
                if (A[j] - A[j - 1] > 1) {
                    System.out.println("NO");
                    no = true;
                    break;
                }
            }
            
            if (!no) {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}