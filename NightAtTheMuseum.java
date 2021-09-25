//	731 A - Night at the Museum

import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        sc.close();

        char pointsTo = 'a';
        int rotations = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d1 = Math.abs((int)(c - pointsTo));
            int d2 = (int)(26 - d1);
            rotations += Math.min(d1, d2);
            pointsTo = c;
        }
        
        System.out.println(rotations);
    }
}