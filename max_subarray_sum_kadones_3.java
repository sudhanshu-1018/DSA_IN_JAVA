public class max_subarray_sum_kadones_3{
    public static void kadone(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currSum=currSum+numbers[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
    System.out.println("our max subarray sum is="+maxSum);
    }
    public static void main(String args[]){
        int numbers[]={5,6,7,3,5,7,6,3,4};
        kadone(numbers);
    }
}