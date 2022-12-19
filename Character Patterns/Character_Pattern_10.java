// Character Pattern 10

/* 
-----------------
A 
B B
C C C
D D D D
E E E E E
-----------------
*/

import java.util.*;

public class Character_Pattern_10 {

    public static void main(String[] args) {

        int n;
        char c ='A';

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        if (n > 26 || n == 0) {
            System.out.println("\nError!!\nInput Range should be 1 to 26");
            sc.close();
            return;
        }

        // Outer loop
        for (int i = 1; i <=n; i++) {

            // Inner Loop
            for (int j = 1; j <= i; j++) {

                System.out.print(c + " ");
            }
            c++;
            System.out.println();
        }

        sc.close();
    }
}
