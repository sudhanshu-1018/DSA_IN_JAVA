public class LinkedList_Zig_Zag {
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

    public static void zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //alternate merge -zig-zag merge
        while (left!=null && right!=null) {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


public static void main(String[] args) {
    // Adding elements to the custom linked list
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    // Print original list
    printList(head);

    // Perform zigzag reordering
    zigzag();

    // Print modified list
    printList(head);
}

}


// import java.util.LinkedList;
// import java.util.ListIterator;

// public class LinkedList_Zig_Zag {
//     public static void zigzag(LinkedList<Integer> ll) {
//         // Find mid
//         int size = ll.size();
//         int midIndex = size / 2;

//         // Reverse second half
//         LinkedList<Integer> secondHalf = new LinkedList<>();
//         ListIterator<Integer> iterator = ll.listIterator(midIndex);
//         while (iterator.hasNext()) {
//             secondHalf.addFirst(iterator.next());
//         }

//         // Merge two halves in zig-zag manner
//         iterator = ll.listIterator(midIndex);
//         ListIterator<Integer> secondHalfIterator = secondHalf.listIterator();
//         while (iterator.hasNext() && secondHalfIterator.hasNext()) {
//             iterator.next();
//             iterator.add(secondHalfIterator.next());
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList<Integer> ll = new LinkedList<>();
//         ll.addFirst(3);
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);

//         System.out.println("Original list: " + ll);
//         zigzag(ll);
//         System.out.println("Zigzag list: " + ll);
//     }
// }

