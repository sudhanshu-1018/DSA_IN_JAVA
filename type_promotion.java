public class type_promotion{
    public static void main(String args[]){
        char a='a';
        short b=50;

        System.out.println(a);
        System.out.println((int)a);
        System.out.println(a+b);

        byte c=5;
        //c=c*2;                           //c*2  here b is automatic type promotion ,therefore value of c=99;
        c=(byte)(c*2);
        System.out.println(c);
    }
}