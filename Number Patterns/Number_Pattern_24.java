// Number Pattern 24

/* 
---------------------
1 2 3 4 5 5 4 3 2 1 
1 2 3 4     4 3 2 1
1 2 3         3 2 1
1 2             2 1
1                 1
---------------------
*/

import java.util.*;

public class Number_Pattern_24 {

    public static void main(String[] args) {

        int n, count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = n; i >= 1; i--) {

            // Inner Loop - Normal Number
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }

            // Inner Loop - Space

            for (int sp = 1; sp <= (count * 2); sp++) {

                System.out.print("  ");
            }
            count++;

            // Inner Loop - Reverse Number
            for (int j = i; j >= 1; j--) {

                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
