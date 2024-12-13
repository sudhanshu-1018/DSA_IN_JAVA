public class BackTracking_Array{
    public static void changeArr(int arr[],int i,int val){
        //base
        if(i==arr.length){
            printArray(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;            //BackTracking step  //change array when returning
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        changeArr(arr,0,1);        //print array when going upward 1,2,3,4,5
        printArray(arr);          //print changed array when returning
    }
}