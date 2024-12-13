import java.util.*;
public class sum_of_first_n_natural_number{
    public static void main(String args[]){
        System.out.print("Enter the number:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=1;
        int sum=0;
        // System.out.println(5*((nk+n)/2));                 //by arithmetic progression
            while(a<=n){
                sum+=a;
                a++;
                // break;
            }
                System.out.println(sum);
    }
}