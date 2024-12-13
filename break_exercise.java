import java.util.*;

public class break_exercise{
    public static void main(String args[]){
        System.out.println("Enter the number:-");
         Scanner sc=new Scanner(System.in);
        

        // while(true){
        // int ten=sc.nextInt();
        //     if(ten%10==0){
        //         break;
        //     }
        // }
        for(int i=0;;i++){
        int ten=sc.nextInt();
            if(ten%10==0){
                break;
            }
        }
    }
}