import java.util.*;

public class continue_exercise{
    public static void main(String args[]){
        System.out.print("Enter the number you want:");
        Scanner sc=new Scanner(System.in);
        int zero=sc.nextInt();
        
        for(int i=0;i<=zero;i++){
        System.out.print("now start entering the number:");
        int ten=sc.nextInt();
                if(ten%10==0){
                    continue;
                }
        System.out.println(+ten);
        }
    }
}