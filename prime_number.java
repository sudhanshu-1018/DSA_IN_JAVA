import java.util.*;

public class prime_number{
    public static void main(String args[]){
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int prime=sc.nextInt();

        int k=0;
        for(int i=2;i<prime;i++){
            if(prime%i!=0){
                k++;
            }
        }
        if(k==(prime-2)){
        System.out.print("prime");
        }
        else{
            System.out.print("not prime");
        }
        }
}