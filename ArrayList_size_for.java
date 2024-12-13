import java.util.ArrayList;
public class ArrayList_size_for{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        
        //loop in ArrayList
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        //reverse of loop
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        //find maximum
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
            // max=Math.max(max,list.get(i));
        }
        System.out.println("Maz Value="+ max);

    }
}