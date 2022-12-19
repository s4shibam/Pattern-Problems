// Number Pattern 7

/* 
-----------------
1 2 3 4 5 
1 2 3 4   
1 2 3     
1 2       
1   
-----------------
*/

import java.util.*;

public class Number_Pattern_07 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = n; i >= 1; i--) {

            // Inner Loop
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
