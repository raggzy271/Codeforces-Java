//	721 A - One-dimensional Japanese Crossword

import java.util.Scanner;

public class OneDimensionalJapaneseCrossword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        sc.close();
        
        int[] sizes = new int[51];
        int k = 0;

        int currentSize = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'B') {
                currentSize++;
                sizes[k] = currentSize;
                if (i == n - 1) {
                    k++;
                }
            }
            else if (currentSize > 0) {
                currentSize = 0;
                k++;
            }
        }
        
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(sizes[i] + " ");
        }
    }
}