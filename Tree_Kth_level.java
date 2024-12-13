import java.util.Queue;
import java.util.LinkedList;

public class Tree_Kth_level {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static class Binarytree{
        static int idx=-1;
        public static Node builtree(int tree[]){
            idx++;
            if(tree[idx]==-1){
                return null;
            }
            Node newNode=new Node(tree[idx]);
            newNode.left=builtree(tree);
            newNode.right=builtree(tree);

            return newNode;
        }
        public static void levelorder(Node root,int k){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            
            q.add(root);
            int count=0;

            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    
                    if(q.isEmpty()){
                        return;
                    }else{
                        count++;
                    }
                }else{
                   
                        System.out.print(currNode.data+" ");
    
                        if(currNode.left!=null){
                            q.add(currNode.left);
                        }
                        if(currNode.right!=null){
                            q.add(currNode.right);
                        }
                }
                
            }
        }
    }
    public static void kLevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
        }

        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }
    
    public static void main(String args[]){
        int tree[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int k=3;

        Binarytree s=new Binarytree();
        Node root=s.builtree(tree);

        // System.out.println(root.data);
        s.levelorder(root, k);
        System.out.println();

        // Node root=new Node(1);
        // root.left=new Node(2);
        // root.right=new Node(3);
        // root.left.left=new Node(4);
        // root.left.right=new Node(5);
        // root.right.left=new Node(6);
        // root.right.right=new Node(7);

        // kLevel(root, 1, k);

    }
}
