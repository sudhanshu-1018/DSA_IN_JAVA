public class Recursion_first_occurrence{
    public static int firstOccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,3,6,5,8,9,3,5,5,8,10};
        int key=10;
        System.out.println(firstOccur(arr,key,0));
    }
}