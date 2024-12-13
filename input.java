import java.util.*;

public class input{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Scanner fc= new Scanner(System.in);
        // String name=sc.next();
        // System.out.println(name);
        System.out.print("write your full name:-");
        String name=sc.nextLine();
        System.out.print("write your roll number:-");
        int num=fc.nextInt();

        System.out.println(name); 
        System.out.println(num);
    }
}