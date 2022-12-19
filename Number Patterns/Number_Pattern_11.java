// Number Pattern 11

/* 
-----------------
9 7 5 3 1 
9 7 5 3   
9 7 5     
9 7       
9
-----------------
*/

import java.util.*;

public class Number_Pattern_11 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();
        n = n + (n - 1);

        // Outer loop
        for (int i = 1; i <= n; i += 2) {

            // Inner Loop
            for (int j = n; j >= i; j--) {

                if (j % 2 != 0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
