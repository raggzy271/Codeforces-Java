import java.util.HashMap;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String args[]) {
        final int horseshoes = 4;
        final HashMap<Integer, Integer> colorCount = new HashMap<Integer, Integer>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < horseshoes; i++) {
            int color = sc.nextInt();
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }

        sc.close();

        int toBuy = 0;
        for (int color : colorCount.keySet()) {
            toBuy += colorCount.get(color) - 1;
        }

        System.out.println(toBuy);
    }
 }