public class solid_rhombus{
    public static void rhom(int n){
        for(int i=1;i<=n;i++){
            for(int j=(n-1);j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
        System.out.println();
        }
    }
    public static void main(String args[]){
        rhom(10);
    }
}