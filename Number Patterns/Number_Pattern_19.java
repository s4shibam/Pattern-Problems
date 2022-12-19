// Number Pattern 19 (Floyd's Triangle)

/* 
-----------------
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
-----------------
*/

import java.util.*;

public class Number_Pattern_19 {

    public static void main(String[] args) {

        int n, digit = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner Loop
            for (int j = 1; j <= i; j++) {

                digit++;
                System.out.print(digit + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
