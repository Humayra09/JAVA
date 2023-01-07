import java.util.*;

public class calcsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a= sc.nextInt();
        System.out.print("Enter second number:");
        int b= sc.nextInt();
        int sum = a+b ;
        PrintSum(a,b);
        System.out.println("Sum is:"+sum);

    }
    public static  int PrintSum(int a, int b){
        int sum = a + b;
        return sum;

    } 
}
