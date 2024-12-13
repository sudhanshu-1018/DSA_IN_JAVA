import java.util.ArrayList;

public class Binary_tree_part3 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

// Approach 1 lowest common ancestor
    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundleft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);

        if (foundleft || foundright) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node low_common_anc(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root, n1, path1);
        getpath(root, n2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        Node lastcomm = path1.get(i - 1);
        return lastcomm;

    }

// Apparoach 2 lowest common ancestor
    public static Node apporoach2_low_com(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftNode = apporoach2_low_com(root.left, n1, n2);
        Node rightNode = apporoach2_low_com(root.right, n1, n2);

        if (leftNode == null) {
            return rightNode;
        }
        if (rightNode == null) {
            return leftNode;
        }

        return root;

    }
//distance b/w nodes
    public static int dist_bw_nodes(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftdist = dist_bw_nodes(root.left, n);
        int rightdist = dist_bw_nodes(root.right, n);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        } else if (leftdist == -1) {
            return rightdist + 1;
        } else {
            return leftdist + 1;
        }
    }

    public static int dist_nodes(Node root, int n1, int n2) {
        Node lca = apporoach2_low_com(root, n1, n2);

        int dist1 = dist_bw_nodes(lca, n1);
        int dist2 = dist_bw_nodes(lca, n2);

        return dist1 + dist2;
    }
//kth ancestor
    public static int kth_Ancestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftdist = kth_Ancestor(root.left, n, k);
        int rightdist = kth_Ancestor(root.right, n, k);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }
        int max = Math.max(leftdist, rightdist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }

        return max + 1;
    }

//sum of tree
    public static int sum_Nodes(Node root) {
        int j = 0;
        if (root == null) {
            return 0;
        } else {
            j = root.data + j;
        }

        int leftdist = sum_Nodes(root.left);
        int rightdist = sum_Nodes(root.right);

        return leftdist + rightdist + j;
    }

//transfor to sum of tree
    public static int Transform_to_sum_Tree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNode = Transform_to_sum_Tree(root.left);
        int rightNode = Transform_to_sum_Tree(root.right);

        int data = root.data;

        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;

        root.data = newleft + leftNode + newright + rightNode;

        return data;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(low_common_anc(root, 4, 5).data);
        System.out.println(apporoach2_low_com(root, 4, 6).data);
        System.out.println(dist_nodes(root, 4, 6));
        System.out.println(kth_Ancestor(root, 5, 2)); //--------------->output 1
        System.out.println(sum_Nodes(root));
        Transform_to_sum_Tree(root);
        preorder(root);

        /*
         *  27
         * /  \
         * 9   13
         * / \ / \
         * 0 0 0  0
         * 
         */
    }
}