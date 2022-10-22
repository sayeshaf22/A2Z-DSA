import java.util.*;
public class Pattern5 {

    static void printTriangle(int n){

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
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