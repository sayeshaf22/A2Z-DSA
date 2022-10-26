import java.util.*;
public class Pattern17{

    static void printTriangle(int n){
        for(int i = 1; i <= n; i++){
              char val = 'A';
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
                
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print(val);
            
                val++;
                
            }
            val--;
            for(int j = 1; j <= i - 1; j++)
            {
                val--;
                System.out.print(val);
            
                
                
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
