import java.util.Scanner;

// Hollow Diamond Pattern

/* 
-----------------
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
-----------------
*/
public class Hollow_Diamond {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range for Row = ");
        n = sc.nextInt();

        // Upper Part
        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; j++) {

                System.out.print(" ");
            }
            if (i == 1) {

                System.out.print("\n");
            } else {

                System.out.print("*" + "\n");
            }
        }
        // Lower Part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {

                System.out.print(" ");
            }

            System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; j++) {
                // prints space
                System.out.print(" ");
            }
            if (i == 1) {

                System.out.print("\n");
            } else {

                System.out.print("*" + "\n");
            }
        }

        sc.close();
    }
}
