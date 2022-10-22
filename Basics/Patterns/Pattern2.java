import java.util.*;
public class Pattern2 {

    static void printTriangle(int n){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("* ");
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