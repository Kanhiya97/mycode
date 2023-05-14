public class BinaryTrees {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void preOrder(Node root) {
        // Node Left Right (NLR)
        if (root == null)
            return;

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        // Left Right Node (LRN)
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public static void inOrder(Node root){
        // Left Node Rigth (LNR)
        if(root==null)
        return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(15, null, null);
        Node rootleft = new Node(24, null, null);
        Node rootright = new Node(35, null, null);

        root.left = rootleft;
        root.right = rootright;

        // preOrder(root);
        // postOrder(root);
        inOrder(root);

    }
}
