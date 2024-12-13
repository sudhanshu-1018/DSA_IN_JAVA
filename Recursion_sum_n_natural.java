public class Recursion_sum_n_natural{
    public static int sumNatural(int n){
        if(n==1){
            return 1;
        }
        sumNatural(n-1);
        return n+sumNatural(n-1);
    }
    public static void main(String args[]){
        int k=5;
        System.out.print(sumNatural(k));
    }
}