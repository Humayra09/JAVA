import java.util.*;
class loops_hollowrectangle {
    public static void main( String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        System.out.print("Enter number of columns:");
        int m = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1;j<=m;j++){
                if (i==1 || j==1 ||i==n ||j==m) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
                 OUTPUT:
Enter number of rows:4
Enter number of columns:8
********
*      *
*      *
********
 */