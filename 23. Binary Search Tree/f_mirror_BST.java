public class f_mirror_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }

    public static Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }

        if(root.data < val){
            //right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return ;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }

        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }

        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    
    public static void main(String[] args) {
        /*
         *              8
         *             / \
         *            5   10
         *           / \    \
         *          3   6    11
         */

         Node root = new Node(8);
         root.left = new Node(5);
         root.left.left = new Node(3);
         root.left.right = new Node(3);
         root.right = new Node(10);
         root.right.right = new Node(11);
         

        root = createMirror(root);
        preorder(root);

    }
}
