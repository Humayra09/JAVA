import java.util.*;

class calculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
    
    //Take two integers from user to perform operation
    System.out.println("Enter first number:");
    int a = sc.nextInt();
    System.out.println("Enter second number");
    int b = sc.nextInt();
    System.out.println("Enter your choice for the operation you need to perform\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
    int choice = sc.nextInt();
        
    //We are performing all the operations using switch cases
    switch(choice){
        case 1 : int add=a+b;
        System.out.println("The sum of given numbers is:"+add);
        break;
        case 2 : int sub=a-b;
        System.out.println("The difference of given numbers is:"+sub);
        break;
        case 3 : int mul=a*b;
        System.out.println("The product of given numbers is:"+mul);
        break;
        case 4 : int div=a/b;
        System.out.println("The quotient on division of given numbers is:"+div);
        break;
        case 5 : int mod=a%b;
        System.out.println("The remainder on division of given numbers is:"+mod);
        break;
        default :System.out.println("invalid choice");

        }

    }

}
