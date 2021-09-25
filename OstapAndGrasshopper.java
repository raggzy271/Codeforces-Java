//	735 A

import java.util.Scanner;

public class OstapAndGrasshopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String line = sc.next();

        sc.close();

        int a = line.indexOf('G');
        int b = line.indexOf('T');

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // a needs to get to b (and because a < b, it will go to the right)

        char c = ' ';
        do {
            a += k;
        } while (a < b && (c = line.charAt(a)) == '.');

        if (c == '#' || a > b) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}