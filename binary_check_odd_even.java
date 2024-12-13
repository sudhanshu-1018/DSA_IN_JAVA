import java.util.*;
public class binary_check_odd_even{
    public static void odd_even(int n){
       int bitmask=1;
       if((n & bitmask)==0){
        System.out.println("even");
       }else{
        System.out.println("odd");
       }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        int a=sc.nextInt();
        odd_even(a);
    }
}