/*
Below is the pattern we need to print:
            *   
            **  
            *** 
            ****
            *****



 */
import java.util.*;
class half_pyramid {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){//for outer loop to print rows
            for(int j=1; j<=i ;j++){//inner for loop for printing columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
