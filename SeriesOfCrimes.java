//	181 A - Series Of Crimes

import java.util.Scanner;
import java.util.Map.Entry;
import java.util.HashMap;

public class SeriesOfCrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<Integer, Integer> abscissas = new HashMap<>();
        HashMap<Integer, Integer> ordinates = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String line = sc.next();
            for (int j = 1; j <= m; j++) {
                if (line.charAt(j - 1) == '*') {    
                    abscissas.put(i, abscissas.getOrDefault(i, 0) + 1);
                    ordinates.put(j, ordinates.getOrDefault(j, 0) + 1);
                }
            }
        }

        sc.close();

        for (Entry<Integer, Integer> entry : abscissas.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.print(entry.getKey() + " ");
                break;
            }
        }
        
        for (Entry<Integer, Integer> entry : ordinates.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.print(entry.getKey());
                break;
            }
        }
    }
}