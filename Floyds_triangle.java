import java.util.*;
class Floyds_triangle {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        int count = 1;
        for(int i = 1; i<=n ; i++){
            for(int j = 1 ; j<= i ; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
