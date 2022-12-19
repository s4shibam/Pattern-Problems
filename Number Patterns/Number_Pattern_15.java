// Number Pattern 15

/* 
-----------------
1         
2 2       
3 3 3     
4 4 4 4   
5 5 5 5 5 
-----------------
*/

import java.util.*;

public class Number_Pattern_15 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner Loop
            for (int j = i; j >= 1; j--) {

                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
