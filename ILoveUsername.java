//	155 A - I_love_%username%

import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int worst, best;
        worst = best = sc.nextInt();
        
        int amazing = 0;

        for (int i = 1; i < n; i++) {
            int score = sc.nextInt();
            
            if (score < worst) {
                amazing++;
                worst = score;

            }
            else if (score > best) {
                amazing++;
                best = score;
            }
        }
        
        sc.close();
        
        System.out.println(amazing);
    }
}