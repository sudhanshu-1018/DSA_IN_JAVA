public class LinkedList__detect_loop_Cycle {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public static boolean detect_cycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle=false){
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null;  //last node
        while (slow!=fast) {
            prev=fast;

            slow=slow.next;  //slow+1
            fast=fast.next;  //fast+1
        }
        //remove cycle->last.next=null
        prev.next=null;
    }
    public static void main(String args[]){
        head=new Node(1);                         //head is already globally decllaired
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head.next;         //3 is pointing 2;


        System.out.println(detect_cycle());
        removeCycle();
        System.out.println(detect_cycle());


        
    }
}
