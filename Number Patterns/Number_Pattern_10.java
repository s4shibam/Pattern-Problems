// Number Pattern 10

/* 
-----------------
9 7 5 3 1 
7 5 3 1   
5 3 1     
3 1       
1 
-----------------
*/

import java.util.*;

public class Number_Pattern_10 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();
        n = n + (n - 1);

        // Outer loop
        for (int i = n; i >= 1; i -= 2) {

            // Inner Loop
            for (int j = i; j >= 1; j--) {

                if (j % 2 != 0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
