import java.util.*;
public class binomial_cofficient{
    public static int calculatecofficient(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;   
    }
    public static int calculatebinomial(int a,int b){
        int j=(a-b);

        int bino=calculatecofficient(a);
        int mial=calculatecofficient(b);
        int cof=calculatecofficient(j);

        return ((bino)/(mial*(cof)));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("FOR BINOMIAL COFFICIENT:\nEnter the value of n=");
        int n=sc.nextInt();
        System.out.println("Enter the value of r=");
        int r=sc.nextInt();

        System.out.println(calculatebinomial(n,r));

       
        // System.out.println(bino);
        // System.out.println(mial);
        // System.out.println(cof);
    }
}