import java.util.*;
public class Pattern3 {

    static void printTriangle(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i + 1; j++){
                System.out.print(j + " ");
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