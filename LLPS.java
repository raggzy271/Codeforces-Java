// 202 A

import java.util.Scanner;

public class LLPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int n = s.length();
        char max = s.charAt(0);
        int count = 1;

        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (c > max) {
                max = c;
                count = 1;
            }
            else if (c == max) {
                count++;
            }
        }

        System.out.println(new String(new char[count]).replace('\0', max));
    }
}