import java.util.*;
public class Pattern6{

    static void printTriangle(int n){

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i ; j++){
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


