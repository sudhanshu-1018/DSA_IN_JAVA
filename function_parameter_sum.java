import java.util.*;

public class function_parameter_sum{
    public static int calculatesum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        int sum=calculatesum(a,b);                         //this sum is defferent from sum in calculatesum (function)
        System.out.println("the sum is:" sum);
    }
}
//NOTE:
// the sum in calculatesum (function ) is different from the sum in main (function);