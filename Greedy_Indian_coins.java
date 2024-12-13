import java.util.*;
public class Greedy_Indian_coins {
    public static void main(String args[]){
        int coin[]={1,2,5,10,20,50,100,500,2000};
        int v=590;
        ArrayList<Integer>s=new ArrayList<>();

        int count=0;
        for(int i=coin.length-1;i>=0;i--){
            while(v>=coin[i]){
                v-=coin[i];
                count++;
                s.add(coin[i]);
            }
        
        }
        System.out.println(count);
        System.out.print(s);
    }
}
