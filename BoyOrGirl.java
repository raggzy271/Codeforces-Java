import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        final int letters = 26; // only lowercase English letters
        final boolean[] usernameLetters = new boolean[letters];
        
        Scanner sc = new Scanner(System.in);
        final String username = sc.next();
        sc.close();

        int distinct = 0;
        for (int i = 0; i < username.length(); i++) {
            int index = username.charAt(i) - 'a';
            if (!usernameLetters[index]) {
                distinct++;
                usernameLetters[index] = true;
            }
        }

        if (distinct % 2 != 0) {
            System.out.println("IGNORE HIM!");
        }
        else {
            System.out.println("CHAT WITH HER!");
        } 
    }
}
