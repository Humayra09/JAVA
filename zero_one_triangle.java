import java.util.*;
class zero_one_triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        for(int i=1; i<=n ; i++ ){
            for(int j=1 ;j<=i; j++){
                int sum= i+j;
                if(sum % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
//      *******OUTPUT*****
// Enter number of rows:5
// 1
// 01
// 101
// 0101
// 10101