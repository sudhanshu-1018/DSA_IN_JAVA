public class LinkedList_Find_remove_N_end {
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
    public void addFirst(int data){
        //step1->create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;  //link
            return;
        }
        //step2->newNode next=head
        newNode.next=head;

        //step3->head=newNode
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public static void deleteNthfromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;  //remove first
            return;
        }
        //sz-n;
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedList_Find_remove_N_end ll=new LinkedList_Find_remove_N_end();
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addLast(9);
        ll.addLast(8);

        ll.print();
        deleteNthfromEnd(3);
        ll.print();


    }
}
