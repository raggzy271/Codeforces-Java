// 71 A

import java.util.Scanner;
 
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        while(n-- != 0) {
            String temp = sc.next();
            int len = temp.length();
 
            if(len <= 10) {
                System.out.println(temp);
            }
            else {
                System.out.print(temp.charAt(0));
                System.out.print(len-2);
                System.out.println(temp.charAt(len-1));
            }
        } 
        
        sc.close();
    }
}