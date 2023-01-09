import java.util.*;
class calcprod {
    public static int product(int a, int b){
    
        int mul = a*b;
        return mul ;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a= sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        product(a,b);
        int mul = a*b;
        System.out.println("Product is:"+mul);
    }
}
