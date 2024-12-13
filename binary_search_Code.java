public class binary_search_Code{
    public static int binarySearch(int numbers[],int key){
        int start=0, end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;                 //change value of mid inside above number array  :number[mid]
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={5,4,6,8,9,10,7,0,4,10,15};
        int key=10;
        System.out.println(binarySearch(numbers,key));
    }
}