public class divide_shorted_and_rotated{
    public static int findPlace(int arr[],int loc,int si,int ei){
        if(si>ei){
            return -1;                    //target not found (key not exist in the array);   
        }
        int mid=(si+ei)/2;
        if(arr[mid]==loc){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=loc && loc<=arr[mid]){
                return findPlace(arr,loc,si,mid-1);
            }else{
                return findPlace(arr,loc,mid+1,ei);
            }
        }else{
            if(arr[mid]<=loc && loc<=arr[ei]){
                return findPlace(arr,loc,mid+1,ei);
            }else{
                return findPlace(arr,loc,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int loc=0;
        System.out.println(findPlace(arr,loc,0,arr.length-1));
    }
}