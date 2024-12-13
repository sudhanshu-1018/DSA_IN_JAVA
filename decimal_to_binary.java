public class decimal_to_binary{
    public static int decimal(int a){
        int n=0;
        int k=0;
        while(a>0){
        int j=a%2;
        n=n+(j*(int)Math.pow(10,k));
        a=a/2;
        k++;
        }
        return n;
    }
    public static void main(String args[]){
        System.out.print(decimal(1));
    }
}