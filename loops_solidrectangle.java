//  Solid Rectangle for n rows and m columns
import java.util.*;
class loops_solidrectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        System.out.print("Enter number of columns:");
        int m = sc.nextInt();
        for(int i=1;i<=n ;i++){             //outer loop for printing rows

            for(int j=1;j<=m ;j++){          //inner loop for printing columns

                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
}