public class LinkedList{
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
    public static int size;

    public void addFirst(int data){
        //step1->create new node
        Node newNode=new Node(data);
        size++;
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
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst((data));
            return;
        }
        Node newNode=new Node(data);
        size++; 
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev:i=size-2;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    
    //search linkedlist by iteration
    public int search(int key){
        int idx=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }
    //search linkedlist by recursion
    public int healper(Node head,int key){
        if(head.next==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=healper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
        
    }
    public int searchrecursion(int key){
        return healper(head, key);
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
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
        LinkedList ll=new LinkedList();
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3 );
        // ll.print();
        ll.addLast(4);

        ll.addMiddle(2,9);
        ll.print();

        System.out.println(ll.search(9));
        System.out.println(ll.search(10));
        System.out.println(ll.searchrecursion(9));

        ll.reverse();
        ll.print();

        



        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.print(ll.size);
    }
}