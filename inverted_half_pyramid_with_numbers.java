import java.util.*;
class inverted_half_pyramid_with_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1 ; j<=n-i+1 ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
