// 34 A

import java.util.Scanner;

public class Reconnaissance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int first = sc.nextInt();
        int prev = first;
        
        int index = 0;
        int min_diff = 1000;
        
        for(int i=1; i<n; i++) {
            int current = sc.nextInt();
            int temp = Math.abs(prev - current);
            
            if(temp < min_diff) {
                min_diff = temp;
                index = i;
            }
            
            prev = current;
        }

        sc.close(); 
        
        //prev has the last element
        if(Math.abs(prev - first) < min_diff) {
            index = n;
        }

        System.out.println(index + " " + (++index!=n+1 ? index : 1));
    }
}