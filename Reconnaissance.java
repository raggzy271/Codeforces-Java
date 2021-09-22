//	32 A

import java.util.Scanner;
import java.util.Arrays;

public class Reconnaissance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        sc.close();
        
        Arrays.sort(A);

        int i = 0, j = 1;
        int ways = 0;
        while (j < n) {
            if (A[j] - A[i] <= d) {
                ways += j - i;
                j++;
            }
            else {
                i++;
            }
        }
        ways *= 2;
        
        System.out.println(ways);
    }
}