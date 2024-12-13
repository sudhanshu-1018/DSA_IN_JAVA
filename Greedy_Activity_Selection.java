import java.util.*;
public class Greedy_Activity_Selection {
    public static void find_max(int start[],int end[]){
        ArrayList<Integer> s=new ArrayList<>();
        int count=1;
        s.add(0);
        int lastend=end[0];
        for(int i=1;i<end.length;i++){
            
            if(start[i]>=lastend){
                count++;
                s.add(i);
                lastend=end[i];    //ending time of current i 
            }

        }
        System.out.println(count);
        for(int i=0;i<s.size();i++){
            System.out.print("A"+s.get(i)+" ");
        }
    }
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        find_max(start, end);
    }
}
