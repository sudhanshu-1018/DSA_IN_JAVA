import java.util.*;

public class else_if_incomeTax{
    public static void main(String args[]){
        System.out.print("Enter your income to calculate tax:-");
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        if(income<500000){
            System.out.println("0% tax");
            System.out.println(income*(0/100)); 
        }
        else if(income>=500000 && income<=1000000){
            System.out.println("20% tax");   
            System.out.println(income*(0.2));   
        }
        else{
            System.out.println("30% tax");
            System.out.println(income*(0.3)); 
        }
    }
}