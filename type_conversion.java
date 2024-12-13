import java.util.*;

public class type_conversion{
    public static void main(String args[]){
        int a=45;
        float b=a;
        System.out.println(b);

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Int number to convert into float by type conversion:-");
        float number=sc.nextInt();
        System.out.println(number);
    }
}