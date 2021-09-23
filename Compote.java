//	746 A

import java.util.Scanner;

public class Compote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        sc.close();

        int fruits = 0;
        
        while (a >= 1 && b >= 2 && c >= 4) {
            a -= 1;
            b -= 2;
            c -= 4;
            fruits += 7;
        }
        
        System.out.println(fruits);
    }
}