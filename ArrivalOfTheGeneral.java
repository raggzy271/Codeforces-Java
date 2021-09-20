// 144 A Arrival of the General

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        int minIndex = -1, maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (minIndex < 0 || A[i] <= A[minIndex]) { // <= because we want the right-est minimum element
                minIndex = i;
            }
            if (maxIndex < 0 || A[i] > A[maxIndex]) { // > because we want the left-est maximum element
                maxIndex = i;
            }
        }

        int swaps = maxIndex + n - 1 - minIndex;
        if (minIndex < maxIndex) {
            swaps--;
        }

        System.out.println(swaps);
    }
}