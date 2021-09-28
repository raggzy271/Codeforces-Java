//	702A - Maximum Increase

import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        sc.close();
        
        int maxlen = 1;     // counting just the first element
        int currlen = 1;    

        for (int i = 1; i < n; i++) {
            if (A[i - 1] < A[i]) {
                currlen++;
                maxlen = Math.max(currlen, maxlen);
            }
            else {
                currlen = 1;
            }
        }
        
        System.out.println(maxlen);
    }
}