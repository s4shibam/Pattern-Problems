import java.util.*;

/* 
-----------------
* * * * * 
  * * * *
    * * *
      * *
        *
-----------------
*/

public class P8_Inverted_Mirrored_Half_Pyramid {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner loop -> Space print
            for (int sp = 1; sp <= i - 1; sp++) {
                System.out.print("  ");
            }

            // Inner loop-> Star print
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        sc.close();
    }
}
