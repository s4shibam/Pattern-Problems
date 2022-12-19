// Character Pattern 5

/* 
-----------------
E 
E D
E D C
E D C B
E D C B A
-----------------
*/

import java.util.*;

public class Character_Pattern_05 {

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
        for (int i = n; i >= 1; i--) {

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
