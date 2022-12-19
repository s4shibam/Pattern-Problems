// Number Pattern 2

/* 
-----------------
5         
5 4       
5 4 3     
5 4 3 2   
5 4 3 2 1 
-----------------
*/

import java.util.*;

public class Number_Pattern_02 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = n; i >= 1; i--) {

            // Inner Loop
            for (int j = n; j >= i; j--) {

                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
