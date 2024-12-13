public class max_subarray_sum_prefixSum_2{
    public static void prefix_sum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<prefix.length;i++){
            for(int j=i;j<numbers.length;j++){
                currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
    System.out.println("max sum="+maxSum);
    }
    public static void main(String args[]){
        int numbers[]={5,6,7,3,5,7,6,3,4};
        prefix_sum(numbers);
    }
}