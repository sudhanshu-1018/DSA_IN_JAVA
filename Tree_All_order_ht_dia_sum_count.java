import java.util.*;
import java.util.LinkedList;
public class Tree_All_order_ht_dia_sum_count {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int tree[]){
            idx++;
            if(tree[idx]==-1){
                return null;
            }
            Node newnNode=new Node(tree[idx]);
            newnNode.left=buildTree(tree);
            newnNode.right=buildTree(tree);

            return newnNode;
        }

        //Tree preorder
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        //Tree Inorder
        public static void Inorder(Node root){
            if(root==null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }

        //Tree postorder
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        //Tree Level Order
        public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        return;
                    }else{
                        q.add(null);
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

        //Tree Height
        public static int TreeHeight(Node root){
            if(root==null){
                return 0;
            }
            int lh=TreeHeight(root.left);
            int rh=TreeHeight(root.right);
            int height=Math.max(lh, rh)+1;

            return height;
        }

        //Count number of Node in Tree
        public static int CountNode(Node root){
            if(root==null){
                return 0;
            }
            int ln=CountNode(root.left);
            int rn=CountNode(root.right);
            int count=ln+rn+1;

            return count;
        }

        //Sum of node of Tree
        public static int SumNode(Node root){
            if(root==null){
                return 0;
            }
            int ls=SumNode(root.left);
            int rs=SumNode(root.right);
            int sum=ls+rs+root.data;

            return sum;
        }

        //Diameter of a tree
        public static int DiameterTree(Node root){
            if(root==null){
                return 0;
            }
            int leftdiam=DiameterTree(root.left);
            int rightdiam=DiameterTree(root.right);


            int leftheight=TreeHeight(root.left);
            int rightheight=TreeHeight(root.right);

            int selfdiam=leftheight + rightheight +1;

            int Maxsubdiam= Math.max(leftdiam,rightdiam);
            int totalMax=Math.max(selfdiam, Maxsubdiam);

            return totalMax;
        }
        //Diameter of a tree (In best time complexity)
        static class Info{
            int diam;
            int ht;
            public Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }
        public static Info diameter(Node root){
            if(root==null){
                return new Info(0, 0);
            }
            Info leftInfo=diameter(root.left);
            Info rightInfo=diameter(root.right);

            int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
            int ht=Math.max(leftInfo.ht,rightInfo.ht+1);

            return new Info(diam, ht);
        }
    }
    public static void main(String args[]){
        int tree[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree s=new BinaryTree();

        Node root=s.buildTree(tree);
        System.out.println(root.data);

        
        s.preorder(root);
        System.out.println();
        
        s.Inorder(root);
        System.out.println();

        s.postorder(root);
        System.out.println();

        s.levelorder(root);
        System.out.println();

        System.out.println(s.TreeHeight(root));

        System.out.println(s.CountNode(root));

        System.out.println(s.SumNode(root));

        System.out.println(s.DiameterTree(root));

        System.out.println(s.diameter(root).diam);
        System.out.println(s.diameter(root).ht);

    }
}
