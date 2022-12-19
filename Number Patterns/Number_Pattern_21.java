// Number Pattern 21

/* 
-----------------
9         
7 9       
5 7 9     
3 5 7 9   
1 3 5 7 9
-----------------
*/

import java.util.*;

public class Number_Pattern_21 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();
        n = n + (n - 1);

        // Outer loop
        for (int i = n; i >= 1; i -= 2) {

            // Inner Loop
            for (int j = i; j <= 9; j++) {

                if (j % 2 != 0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
