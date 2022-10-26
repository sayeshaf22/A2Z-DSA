import java.util.*;
public class Pattern16{

    static void printTriangle(int n){
            
        char val = 'A';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(val);
            }
            val++;
            System.out.println();
        }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printTriangle(n);
    }
}
