// Character Pattern 7

/* 
-----------------
E D C B A 
D C B A
C B A
B A
A
-----------------
*/

import java.util.*;

public class Character_Pattern_07 {

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
        n = 64 + n;

        // Outer loop
        for (int i = n; i >= 65; i--) {

            // Inner Loop
            for (int j = i; j >= 65; j--) {

                System.out.print(((char) j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
