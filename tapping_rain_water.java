public class tapping_rain_water{
    public static int tapping(int numbers[]){
        int n=numbers.length;

        int left[]=new int[n];
        left[0]=numbers[0];  
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],numbers[i]);            //compare from left side that's why [i-1]
        }

        int right[]=new int[n];
        right[n-1]=numbers[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],numbers[i]);           //compare from right side that's why [i+1]
        }
        int total=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(left[i],right[i]);
            int trappedWater=(waterlevel-numbers[i]);           //trappedwater += waterlevel-height[i];
            total=total+trappedWater;
        }
    return total;
    }
    public static void main(String args[]){
        int numbers[]={4,2,0,6,3,2,5};
        System.out.print(tapping(numbers));
    }
}