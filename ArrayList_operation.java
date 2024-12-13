import java.util.ArrayList;
public class ArrayList_operation{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        //add element
        list.add(1); 
        list.add(2); 
        list.add(3); 
        System.out.println(list);
        //add
        list.add(1,5);

        //get element
        int element=list.get(2);
        System.out.println(element);

        //remove element
        list.remove(2);
        System.out.println(list);

        //set element at index
        list.set(1,10);
        System.out.println(list);

        //contain element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}