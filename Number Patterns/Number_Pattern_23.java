// Number Pattern 23

/* 
-----------------
0 
1 1
0 0 0
1 1 1 1
0 0 0 0 0
-----------------
*/

import java.util.*;

public class Number_Pattern_23 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner Loop
            for (int j = 1; j <= i; j++) {

                if (i % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        sc.close();
    }
}
