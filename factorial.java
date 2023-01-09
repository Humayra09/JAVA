import java.util.*;
class factorial {
    public static void factorial(int num){
        int fact = 1;
        if(num<0){
            System.out.println("Invalid number");
            return;
        }
        for(int i=num; i>=1; i--){
            
            fact = fact * i;
            
        }
        System.out.println("Factorial is:"+fact);
        return;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        factorial(num);
    }
}
