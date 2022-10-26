import java.util.*;
public class Pattern19{

    static void printTriangle(int n){

          for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (i - 1) * 2; j++ ) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (i - 1) * 2; j++ ) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printTriangle(n);
    }
}
