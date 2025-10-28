package Trees;

public class TreeServices2 {

    static int maxHeight = 0;
    public static void main(String[] args) {
        TreeServices2 treeServices2 = new TreeServices2();
        //treeServices2.getInOrderTraversal(treeServices2.constructTree());
        treeServices2.getLeftViewOfTree(treeServices2.constructTree(), 1);

    }

    public Node constructTree() {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        return root;

    }

    public void getInOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        while (root.left != null) {
            getInOrderTraversal(root.left);
        }
        System.out.println(root.data);
        while (root.right != null) {
            getInOrderTraversal(root.right);
        }

    }

    /*

         4
     2        6
   1    3   5    7
   */
    public void getLeftViewOfTree(Node root, int currHeight) {



       if (root == null) {
            return;
        }

        if (maxHeight < currHeight) {
            System.out.println(root.data);
            maxHeight = currHeight;
        }

        getLeftViewOfTree(root.left, currHeight+1);
        getLeftViewOfTree(root.right, currHeight+1);


    }

}
