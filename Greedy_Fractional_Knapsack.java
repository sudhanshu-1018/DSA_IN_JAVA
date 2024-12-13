public class Greedy_Fractional_Knapsack {
    public static void main(String args[]){
        int wgt[]={10,20,30};
        int val[]={60,100,120};
        int capacity=50;

        int value=0;
        for(int i=0;i<val.length;i++){
            int ratio=val[i]/wgt[i];
            if(capacity>=wgt[i]){
                capacity=capacity-wgt[i];
                value=value+val[i];
            }else{
                value=value+(ratio * capacity);
                capacity=0;
                break;
            }
        }
        System.out.println(value);
        System.out.println(capacity);
    }
}
