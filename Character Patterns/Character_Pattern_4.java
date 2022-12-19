// Character Pattern 4

/* 
-----------------
E D C B A 
E D C B
E D C
E D
E
-----------------
*/

import java.util.*;

public class Character_Pattern_4 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        if (n > 26 || n == 0) {
            System.out.println("\nError!!\nInput Range should be 1 to 26");
            sc.close();
            return;
        }
        char c = (char) (64 + n);

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner Loop
            for (int j = n; j >= i; j--) {

                System.out.print(c + " ");
                c--;
            }
            c = (char) (64 + n);
            System.out.println();
        }

        sc.close();
    }
}
