import java.util.Deque;
import java.util.LinkedList;
public class Queue_Stack_using_Deque {
    public static class Stack{
        static Deque<Integer> s=new LinkedList<>();
        public static boolean isEmpty(){
            return s.isEmpty();
        }

        public static void push(int data){
            s.addLast(data);
        }
        public static int pop(){
            return s.removeLast();
        }
        public static int peek(){
            return s.getLast();
        }
    } 
    public static class Queue{
        static Deque<Integer> q=new LinkedList<>();

        public static boolean isEmpty(){
            return q.isEmpty();
        }
        public static void add(int data){
            q.addLast(data);
        } 
        public static int remove(){
            return q.removeFirst();
        }
        public static int peek(){
            return q.getFirst();
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        System.out.println();

        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.print(q.peek()+ " ");
            q.remove();
        }
        

    }
}
