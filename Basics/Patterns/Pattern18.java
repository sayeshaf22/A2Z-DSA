import java.util.*;
public class Pattern18{

    static void printTriangle(int n){

        for(int i = n; i >= 1; i--){
             int val = 65;
            for(int j = n; j >= i; j--){
                System.out.print((char)(val+(j-1)) + " ");
                
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
