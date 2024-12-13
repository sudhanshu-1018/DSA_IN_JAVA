import java.util.*;
public class str_inp_out{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");

        // String name=sc.next();
        String fullname=sc.nextLine();

        // System.out.println(name);
        System.out.println(fullname);
        System.out.println(fullname.length());
    }
}