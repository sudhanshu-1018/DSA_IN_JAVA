public class butterfly_pattern{
    public static void butter(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String args[]){
        butter(10);
        // int n=27;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==n/2||i==(n/2)+1||j==1||j==n|i==j||(i+j)==n+1  ){   //||((i==3||i==6)&&(j==2||j==7))
        //            System.out.print("*");
        //         }else{
        //            System.out.print(" ");
        //         }
        //     }
        // System.out.println();
        // }

    }
}