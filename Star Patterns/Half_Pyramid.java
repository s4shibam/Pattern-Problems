// Half Pyramid or Right Angle Triangle Pattern

/* 
-----------------
* 
* *
* * *
* * * *
* * * * *
-----------------
*/
import java.util.*;

public class Half_Pyramid {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner loop
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}