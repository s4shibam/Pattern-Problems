// Blank Diagonal Square Pattern

/* 
------------------------------------------
 * * * * 
*  * * *
* *  * *
* * *  *
* * * *
------------------------------------------
*/

import java.util.*;

public class P12_Blank_Diagonal_Square {
    
    public static void main(String[] args) {
        
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        //Outer Loop
        for (int i=1; i<=n; i++){

            //Inner Loop
            for (int j=1; j<=n; j++){

                if (i==j)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
