// Scalene Triangle Pattern

/* 
-----------------
        * * * * 
      * * *
    * *
  *
-----------------
*/

import java.util.*;

public class P7_Scalene_Triangle {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner loop -> Space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Inner loop-> Star print
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        sc.close();
    }
}
