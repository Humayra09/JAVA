import java.util.*;
public class even {
    public static int even(int n){
        if(n%2 ==0){
            System.out.println("Yes the given number is divisible by 2 !!!");
        }
        else{System.out.println("Sorry !! The given number isn't divisible by 2.");}
        return n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();
        even(n);
    }

}
