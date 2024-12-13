import java.util.Arrays;
import java.util.Comparator;

public class Greedy_Knapsack_not_sorted {
    public static void main(String args[]){
        int wgt[]={10,20,30};
        int val[]={60,100,120};
        int capacity=50;

        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)wgt[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int value=0;
        for(int i=val.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];

            if(capacity>=wgt[idx]){
                capacity=capacity-wgt[idx];
                value=value+val[idx];
            }else{
                // int ratio=val[i]/wgt[i];
                value+=(ratio[i][1] * capacity);
                capacity=0;
                break;
            }
        }
        System.out.println(value);
        System.out.println(capacity);
    }
}
