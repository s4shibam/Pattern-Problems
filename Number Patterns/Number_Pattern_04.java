// Number Pattern 4

/* 
-----------------
5 4 3 2 1 
4 3 2 1
3 2 1
2 1
1
-----------------
*/

import java.util.*;

public class Number_Pattern_04 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = n; i >= 1; i--) {

            // Inner Loop
            for (int j = i; j >= 1; j--) {

                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
