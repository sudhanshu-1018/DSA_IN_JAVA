public class diamond_pattern{
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){    
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){    
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String args[]){
        diamond(7);
    }
}