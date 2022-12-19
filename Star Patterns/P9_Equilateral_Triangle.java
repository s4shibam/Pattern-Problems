// Equilateral Triangle

/* 
------------------------------------------
        *                       1
      *   *                   1   2 
    *   *   *               1   2   3
  *   *   *   *           1   2   3   4
*   *   *   *   *       1   2   3   4   5
------------------------------------------
*/

import java.util.*;

public class P9_Equilateral_Triangle {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner loop -> Space print
            for (int sp = n - 1; sp >= i; sp--) {
                System.out.print("  "); // 2 Spaces
            }

            // Inner loop-> Star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*   "); // 1 Star 3 Spaces
            }
            System.out.println();

        }
        sc.close();
    }

}
