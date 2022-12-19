import java.util.*;

public class P14_House_Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        num = (2 * num) - 1;

        // Roof - Triangle
        // Outer Loop
        for (int i = 5; i <= num; i += 2) {

            // Space Loop
            for (int j = i; j < num; j += 2) {

                System.out.print(" ");
            }
            // Inner Loop
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        // Wall with Door
        // Outer Loop
    }

}