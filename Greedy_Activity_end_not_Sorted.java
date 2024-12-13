import java.util.*;
public class Greedy_Activity_end_not_Sorted {

    public static void find_max(int start[],int end[]){
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lamda function ---->help in sorting
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));


        ArrayList<Integer> s=new ArrayList<>();
        int count=1;
        s.add(activities[0][0]);
        int lastend=activities[0][2];
        
        for(int i=1;i<end.length;i++){
            
            if(activities[i][1]>=lastend){
                count++;
                s.add(activities[i][0]);
                lastend=activities[i][2];    //ending time of current i 
            }

        }
        System.out.println(count);
        for(int i=0;i<s.size();i++){
            System.out.print("A"+s.get(i)+" ");
        }
    }
    public static void main(String args[]){
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};
        find_max(start, end);
    }
}


