// Inverted Half Pyramid Pattern

/* 
-----------------
* * * * * 
* * * *
* * *
* *
*
-----------------
*/

import java.util.*;

public class Inverted_Half_Pyramid {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop -> for (i = n to 1)
        for (int i = n; i >= 1; i--) {

            // Inner loop -> for (j = 1 to n)
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
