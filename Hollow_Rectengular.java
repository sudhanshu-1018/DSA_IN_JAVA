public class Hollow_Rectengular{
    public static void rec(int row,int col){
        //outer loop(row)
         for(int i=1;i<=row;i++){
            // inner loop(column)
            for(int j=1;j<=col;j++){
                // cell- (i,j)
                if(i==1||i==row||j==1||j==col){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
    public static void main(String args[]){
       rec(4,5);
    }
}