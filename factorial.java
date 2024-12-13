import java.util.*;
public class factorial{
    public static int calculatefactorial(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
        // int j=a;
        // int i;
        // for(i=a;i>=1;i--){
        //     j=j*i;
        // }
        // return j/a;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for factorial:");
        int a=sc.nextInt();
        int factorial= calculatefactorial(a);
        System.out.println(factorial);
    }
}