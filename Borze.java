// 32 B

import java.util.Scanner;
 
public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char borze[] = sc.next().toCharArray();
        sc.close();
 
        for(int i=0; i<borze.length; i++) {
            switch(borze[i]) {
                case '.':
                    System.out.print(0);
                    break;
                
                case '-':
                    switch(borze[i+1]) { //won't exceed index limits because '-' is never alone
                        case '.':
                            System.out.print(1);
                            break;
 
                        case '-':
                            System.out.print(2);
                            break;
                    }
                    
                    i++; //no need to consider next character
                    break;
            }
        }
    }
}