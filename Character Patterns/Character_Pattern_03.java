// Character Pattern 3

/* 
-----------------
A B C D E 
A B C D
A B C
A B
A
-----------------
*/

import java.util.*;

public class Character_Pattern_03 {

    public static void main(String[] args) {

        char c = 'A';
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = n; i >= 1; i--) {

            // Inner Loop
            for (int j = 1; j <= i; j++) {

                System.out.print(c + " ");

                // Repeat Alphabets if it ends
                if (c == 'Z')
                    c = 'A';
                else
                    c++;
            }
            c = 'A';
            System.out.println();
        }

        sc.close();
    }
}
