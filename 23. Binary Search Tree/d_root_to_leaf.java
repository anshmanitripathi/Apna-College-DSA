import java.util.ArrayList;

public class d_root_to_leaf {
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

    public static void printPath(ArrayList<Integer> path) {
        for(int i =0; i<path.size() ;i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
        
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);

    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1,4,6,10,11,14};
        Node root = null;

        for(int i = 0 ; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        ArrayList<Integer> path = new ArrayList<>();

        printRoot2Leaf(root, path);
    }
}
