import java.util.Scanner;
 
public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String names = sc.next() + sc.next();
        String shuffled = sc.next();
        
        sc.close();
 
        int n = names.length();
        if(n != shuffled.length()) {
            System.out.println("NO");
            return;
        }
 
        char letters[] = new char[26];
        for(int i = n - 1; i >= 0; i--) {
            letters[shuffled.charAt(i) - 'A']++;
            letters[names.charAt(i) - 'A']--;
        }
 
        for(int i : letters) {
            if(i != 0) {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}