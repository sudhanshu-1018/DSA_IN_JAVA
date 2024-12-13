public class Recuring_last_occurrence{
    public static int lastoccur(int arr[],int key,int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastoccur(arr,key,i-1);
    }
    public static void main(String args[]){
        int arr[]={4,5,3,7,3,0,7,3,9,5,8,6,4};
        int key=4;
        System.out.println(lastoccur(arr,key,arr.length-1));
    }
}