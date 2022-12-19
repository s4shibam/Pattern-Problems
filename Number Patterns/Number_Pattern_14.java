// Number Pattern 14

/* 
-----------------
1 1 1 1 1 
2 2 2 2
3 3 3
4 4
5
-----------------
*/

import java.util.*;

public class Number_Pattern_14 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner Loop
            for (int j = i; j <= n; j++) {

                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
