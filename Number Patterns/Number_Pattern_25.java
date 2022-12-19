// Number Pattern 25

/* 
----------------------------------------------------------------------------------
                                                      (0,4) 
5  5  5  5  5  5  5  5  5                               | 
5  4  4  4  4  4  4  4  5                               |  
5  4  3  3  3  3  3  4  5                               |  
5  4  3  2  2  2  3  4  5                               |  
5  4  3  2  1  2  3  4  5        (-4, 0) ---------------|--------------- (4, 0)
5  4  3  2  2  2  3  4  5                               | (0,0)
5  4  3  3  3  3  3  4  5                               |
5  4  4  4  4  4  4  4  5                               |
5  5  5  5  5  5  5  5  5                               | 
                                                      (0,-4)

** Note: Centre (0, 0) is '1'.
----------------------------------------------------------------------------------
*/

import java.util.*;

public class Number_Pattern_25 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        for (int i = -n + 1; i < n; i++) {

            for (int j = -n + 1; j < n; j++) {
                System.out.printf("%d  ", (Math.max(Math.abs(i), Math.abs(j))) + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}
