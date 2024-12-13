public class Recursion_dec_Inc{
    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printdec(n-1);
    }
    public static void printInc(int n){
        if (n == 1) {
        System.out.println(n);
        return;
        }
        printInc(n - 1);
        System.out.println(n);
    }
    public static void main(String args[]){
        int n=10;
        printInc(n);
    }
}