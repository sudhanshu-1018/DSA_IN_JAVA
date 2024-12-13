import java.util.*;
public class Greedy_Chocola_problem {
    public static void main (String args[]){
        Integer vertiCost[]={1,3,2,1,4};
        Integer horiCost[]={4,1,2};

        Arrays.sort(vertiCost,Collections.reverseOrder());
        Arrays.sort(horiCost,Collections.reverseOrder());

        int h=0, v=0;
        int hp=1, vp=1;
        int cost=0;

        while(h<vertiCost.length && v<horiCost.length){
            if(vertiCost[v]<=horiCost[h]){
                cost+=(horiCost[h]*vp);
                hp++;
                h++;
            }else{
                cost+=(vertiCost[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<horiCost.length){
                cost+=(horiCost[h]*vp);
                hp++;
                h++;
        }
        while(v<vertiCost.length){
            cost+=(vertiCost[v]*hp);
                vp++;
                v++;
        }
        System.out.println("min. cost of cut= "+cost);
    }
}
