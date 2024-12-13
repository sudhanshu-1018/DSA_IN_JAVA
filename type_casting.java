import java.util.*;

public class type_casting{
    public static void main(String args[]){
        double a=25.9;
        // int b=a;
        int b=(int)a;                //losy convert in type casting
        System.out.println(b);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Float number to convert into Int by type casting:-");
        int number=(int)sc.nextFloat();
        System.out.println(number);
    }
}