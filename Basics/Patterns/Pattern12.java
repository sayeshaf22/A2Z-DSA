
import java.util.*;
public class Pattern12{

    static void printSquare(int n){

       int sp = (n * 2) - 2;
        for(int i = 1; i <= n; i++)
        {
            
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            for(int j = 1; j <= sp; j++){
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
             sp = sp - 2;
            System.out.println();
            
        }
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printSquare(n);

    }

}

