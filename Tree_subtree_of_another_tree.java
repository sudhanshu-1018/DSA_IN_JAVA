public class Tree_subtree_of_another_tree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildtree(int tree[]){
            idx++;
            if(tree[idx]==-1){
                return null;
            }
            Node newnode=new Node(tree[idx]);
            newnode.left=buildtree(tree);
            newnode.right=buildtree(tree);

            return newnode;
        }
        public static boolean Isidentical(Node  node,Node subroot){
            if(node==null && subroot==null){
                return true;
            }else if(node==null || subroot==null || node.data!=subroot.data){
                return false;
            }
            if(!Isidentical(node.left, subroot.left)){
                return false;
            }
            if(!Isidentical(node.right, subroot.right)){
                return false;
            }

            return true;
        }
        public static boolean subtree(Node root,Node subroot){
            if(root==null){
                return false;
            }
            if(root.data==subroot.data){
                if(Isidentical(root,subroot)){
                    return true;
                }
            }

            return subtree(root.left, subroot) || subtree(root.right, subroot);
        }
    }
    
    public static void main (String args[]){
        int tree[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int subtree[]={3,-1,6,-1,-1};
        BinaryTree s=new BinaryTree();
        Node root=s.buildtree(tree);
        // Reset the index for building the second tree
        BinaryTree.idx = -1;
        Node subroot=s.buildtree(subtree);

        System.out.println(root.data);

        System.out.println(s.subtree(root, subroot));
    }
}