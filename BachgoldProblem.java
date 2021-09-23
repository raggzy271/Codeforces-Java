//	749 A

import java.util.Scanner;

public class BachgoldProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        sc.close();

        System.out.println(n / 2);
        for (int i = 1; i < n / 2; i ++) {
            System.out.print("2 ");
        }
        
        if (n % 2 == 0) {
            System.out.println("2");
        }
        else {
            System.out.println("3");
        }
    }
}