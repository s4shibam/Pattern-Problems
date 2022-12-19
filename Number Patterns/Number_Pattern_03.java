// Number Pattern 3

/* 
-----------------
1 2 3 4 5 
2 3 4 5   
3 4 5     
4 5       
5
-----------------
*/

import java.util.*;

public class Number_Pattern_03 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner Loop
            for (int j = i; j <= n; j++) {

                System.out.print(j + " ");

            }
            System.out.println();
        }

        sc.close();
    }
}
