// Diamond Pattern
//(n row Equilateral Triangle and n-1 Flipped Equilateral Triangle)

/* 
------------------------------------------
          *   
        *   *
      *   *   *
    *   *   *   *
  *   *   *   *   *
    *   *   *   *
      *   *   *
        *   *
          *
------------------------------------------
*/

import java.util.*;

public class Diamond {

  public static void main(String[] args) {
    int n;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter range for Row = ");
    n = sc.nextInt();

    // Outer loop (Equilateral Triangle)
    for (int i = 1; i <= n; i++) {

      // Inner loop -> Space print
      for (int sp = n; sp >= i; sp--) {
        System.out.print("  "); // 2 Spaces
      }

      // Inner loop-> Star print
      for (int j = 1; j <= i; j++) {
        System.out.print("*   "); // 1 Star 3 Spaces
      }
      System.out.println();

    }

    // Outer loop (Flipped Equilateral Triangle)
    for (int i = n - 1; i >= 1; i--) {

      // Inner loop -> Space print
      for (int sp = i; sp <= n; sp++) {
        System.out.print("  "); // 2 Spaces
      }

      // Inner loop-> Star print
      for (int j = 1; j <= i; j++) {
        System.out.print("*   "); // 1 Star 3 Spaces
      }
      System.out.println();

    }
    sc.close();
  }
}
