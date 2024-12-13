public class diagonal_sum{
    public static int spiral(int matrix[][]){
    //     int k=0;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(i==j){
    //                 k=k+matrix[i][j];
    //             }
    //         }
    //         // System.out.println();
    //     }
    //     return k;
    // }
    // public static int diagonal(int matrix[][]){
    //     int k=0;
    //     int m=0;
    //     int h=matrix[0].length-1;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if((i==m && j==h)){
    //                 if(i!=j){
    //                     // System.out.print(matrix[i][j]);
    //                     k=k+matrix[i][j];
    //                 }
    //                     m++;
    //                     h--;
    //             }
    //         }
    //         // System.out.println();
    //     }
    //     return k;


        // int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("primary diagonal="+spiral(matrix));
        // System.out.println("Secondary diagonal="+diagonal(matrix));
        // System.out.print("Sum of both diagonal="+(spiral(matrix)+diagonal(matrix)));

    }
}