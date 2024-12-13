public class N_Queen{
    public static void Queen(char arr[][],int row){
        if(row==arr.length){
            printarr(arr);
            return;
        }
        //coloumn loop
        for(int j=0;j<arr.length;j++){
            if(issafe(arr,row,j)){
                arr[row][j]='Q';
                Queen(arr,row+1);
                arr[row][j]='x';
            }

        } 
    }
    public static boolean issafe(char arr[][],int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        // diagonal right
        for(int i=row-1,j=col+1;i>=0 && j<arr.length;i--,j++){
                if(arr[i][j]=='Q'){
                    return false;
                }
        }
        // diagonal left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
                  if(arr[i][j]=='Q'){
                    return false;
                }
        }
        return true;
    }
    public static void printarr(char arr[][]){
        System.out.println("____________Queen____________");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=4;
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='x';
            }
        }
        Queen(arr,0);
    }
}