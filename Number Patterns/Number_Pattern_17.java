// Number Pattern 17

/* 
-----------------
5 5 5 5 5 
4 4 4 4
3 3 3
2 2
1
-----------------
*/

import java.util.*;

public class Number_Pattern_17 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = n; i >= 1; i--) {

            // Inner Loop
            for (int j = i; j >= 1; j--) {

                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
