public class BackTracking_Grid_ways{
    public static int grid(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==n){
            return 0;
        }
        int g1=grid(i+1,j,n,m);
        int g2=grid(i,j+1,n,m);
        return g1+g2;
    }
    public static void main(String args[]){
        int n=3,m=3;
        System.out.println(grid(0,0,n,m));
    }
}