// Solid Rectangle Pattern

/* 
-----------------
* * * * * 
* * * * *
* * * * *
* * * * *
* * * * *
-----------------
*/
import java.util.*;

public class Solid_Rectangle {

    public static void main(String[] args) {

        int r, c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        r = sc.nextInt();
        System.out.print("Enter range for Column = ");
        c = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= r; i++) {
            // Inner loop
            for (int j = 1; j <= c; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
