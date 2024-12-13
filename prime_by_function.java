import java.util.*;

public class prime_by_function{
    public static String checkprime(int a){
        int j=0;
        for(int i=1;i<=a;i++){
            if((a%i)==0){
                j++;
            }
        }
        if(j==2){
            return "prime";
        }
        return "not prime";
    }
    public static void okprime(int a){
        for(int i=2;i<=a;i++){
            System.out.println(i+"--"+checkprime(i));
        }
    }
    public static void primeinrange(int a){
        for(int i=2;i<=a;i++){
            if(checkprime(i)=="prime"){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for check prime number or not:-");
        int p=sc.nextInt();
        System.out.println("Enter the number for check prime number or not for series:-");
        int h=sc.nextInt();
        System.out.println(checkprime(p));
        okprime(h);
        primeinrange(h);
    }
}

 