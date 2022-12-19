// Number Pattern 16

/* 
-----------------
5       
4 4     
3 3 3   
2 2 2 2 
1 1 1 1 1
-----------------
*/

import java.util.*;

public class Number_Pattern_16 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = n; i >= 1; i--) {

            // Inner Loop
            for (int j = i; j <= n; j++) {

                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
