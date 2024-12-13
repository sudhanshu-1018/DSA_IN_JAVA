import java.util.Deque;
import java.util.LinkedList;

public class Queue_Deque {
    public static void main(String args[]){
        Deque<Integer> deque=new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);
        System.out.print(deque+" ");

        deque.removeFirst();
        deque.removeLast();
        System.out.print(deque+" ");

        System.out.print(deque.getFirst()+" ");
        System.out.print(deque.getLast()+" ");


    }
}
