import java.util.*;

public class function_for_product{
    public static int calculateproduct(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        // System.out.println(calculateproduct(a,b));
        int product=calculateproduct(a,b);
        System.out.println(product);

    }
}