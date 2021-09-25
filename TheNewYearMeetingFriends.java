//	723 A - The New Year: Meeting Friends

import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] X = new int[3];
        for (int i = 0; i < 3; i++) {
            X[i] = sc.nextInt();
        }
        
        sc.close();
        
        int max = 0, min = 101;
        for (int x : X) {
            max = Math.max(x, max);
            min = Math.min(x, min);
        } 

        int answer = max - min;
        System.out.println(answer);
    }
}