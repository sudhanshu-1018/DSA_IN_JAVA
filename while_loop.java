import java.util.*;

public class while_loop{
    public static void main(String args[]){
    int counter=0;
        while(counter<10){
            System.out.println(counter);
            counter++;
        }
        while(counter<20){
            System.out.println("Hello world");
            counter++;
        }

    System.out.print("Enter the number:-");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int number=1;
        while(number<=n){
            System.out.println(number);
            number++;
        }
   
    }
}