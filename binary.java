import java.util.*;

public class binary {
    public static int game(int input) {
        int i=0;
        int j=2;
        int f=0;
        while (input > 0) {
            int digit = input % 10; // Extract the last digit
            int k=(int)Math.pow(j,i);
            int h=((digit)*(k));
            input /= 10; // Remove the last digit
            i++;
            f=f+h;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number to convert into digit:-");
        int a=sc.nextInt();
        System.out.println("digit number of "+a+" is "+game(a));
    }
}
