import java.util.*;

public class switch_calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:-");
        int a=sc.nextInt();
        System.out.print("Enter the second number:-");
        int b=sc.nextInt();
        System.out.print("Enter operator(+,-,*,/,%):-");
        char operator=sc.next().charAt(0);


        switch(operator){
            case '+':System.out.println(a+b);
                    break;
            case '-':System.out.println(a-b);
                    break;
            case '*':System.out.println(a*b);
                    break;
            case '/':System.out.println(a/b);
                    break;
            case '%':System.out.println(a%b);
                    break;
            default:System.out.println("Wrong operator");
        }
    }
}