//	116 A

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        sc.close();
        
        int pass = 0;       // Passengers in the train rn
        int maxPass = 0;    // Maximum Passengers - equal to the min capacity of the tram
        for (int i = 0; i < n; i++) {
            pass += b[i] - a[i];
            maxPass = Math.max(pass, maxPass);
        }
        
        System.out.println(maxPass);
    }
}