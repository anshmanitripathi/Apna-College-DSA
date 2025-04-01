//Approach 2
public class b_diametertree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        static class info{
            int diam;
            int ht;

            info(int diam , int ht){
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static info diameterOfTree(Node root){

            if(root == null){
                return new info(0 , 0);
            }
            info lInfo = diameterOfTree(root.left);
            info rInfo = diameterOfTree(root.right);
            int diam = Math.max(lInfo.diam , Math.max(rInfo.diam, lInfo.ht + rInfo.ht + 1));
            int ht = Math.max(lInfo.ht , rInfo.ht) + 1;

            return new info(diam, ht);
        }

    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preorder(root);
        System.out.println();

        System.out.println("Diameter of tree : " + tree.diameterOfTree(root).diam);
    }
}
