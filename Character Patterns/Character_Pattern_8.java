// Character Pattern 8

/* 
-----------------
A 
A B
A B C
A B C D
A B C D E
-----------------
*/

import java.util.*;

public class Character_Pattern_8 {

    public static void main(String[] args) {

        char c = 'A';
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

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
