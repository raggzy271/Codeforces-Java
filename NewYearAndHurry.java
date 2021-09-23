//	750 A

import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        sc.close();
        
        int remaining = 240 - k;
        int solves = 0;
        while (solves < n && remaining - 5 *(solves + 1) >= 0) {
            solves++;
            remaining -= 5 * solves;
        }
        
        System.out.println(solves);
    }
}