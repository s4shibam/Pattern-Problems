// Character Pattern 1

/* 
-----------------
A B C D E 
F G H I   
J K L     
M N       
O
-----------------
*/

import java.util.*;

public class Character_Pattern_01 {

    public static void main(String[] args) {

        char c = 'A';
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner Loop
            for (int j = i; j <= n; j++) {

                System.out.print(c + " ");

                // Repeat Alphabets if it ends
                if (c == 'Z')
                    c = 'A';
                else
                    c++;
            }
            System.out.println();
        }

        sc.close();
    }
}
