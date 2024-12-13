import java.util.Stack;
public class StackB_max_area_histogram{
    public static int area_rectangle(int height[]){    //O(n)-time complexity(optimized)
        Stack<Integer> s=new Stack<>();
        int maxArea=0;
        int nsr[]=new int[height.length];
        int nsl[]=new int[height.length];

        //sr
        for(int i=height.length-1;i>=0;i--){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=height.length;    //6
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //sl
        for(int i=0;i<height.length;i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;    
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        for(int i=0;i<height.length;i++){
            int hgt=height[i];
            int wdt=nsr[i]-nsl[i]-1;
            int currArea=hgt*wdt;
            maxArea=Math.max(currArea, maxArea);
        }
        return maxArea;
    }
    public static void main(String args[]){
        int height[]={2,1,5,6,2,3};
        System.out.println("max area in histogram is: " + area_rectangle(height));

    }

}