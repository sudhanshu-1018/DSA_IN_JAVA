import java.util.*;
public class ArrayList_Container_most_water{
    public static int container(ArrayList<Integer> height){
        // int maxWater=0;
        // for(int i=0;i<height.size();i++){
        //     for(int j=i+1;j<height.size();j++){
        //         int ht=Math.min(height.get(i),height.get(j));  //value
        //         int wid=(j-i);                                 //index

        //         int currWater=(ht*wid);
        //         maxWater=Math.max(maxWater,currWater);
        //     }
        // }
        // return maxWater;


        int lp=0;
        int rp=height.size()-1;

        int maxWater=0;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));                 
            int wid=rp-lp;
            int currWater=(ht*wid);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
            maxWater=Math.max(maxWater,currWater);
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(container(height));
    }
}