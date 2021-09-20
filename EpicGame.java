//	119 A - Epic Game

import java.util.Scanner;

public class EpicGame {
    private static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        sc.close();
        
        while (true) {
            n -= gcd(n, a); 
            if (n < 0) {
                System.out.println("1");
                break;
            }
            
            n -= gcd(n, b);
            if (n < 0) {
                System.out.println("0");
                break;
            } 
        }
    }
}