package Trees;

public class TreeServices {
    /*
      4
  2        6
1    3   5    7*/
    int height = 0;
    int current_height = 0;
    int max_height = 0;

    public static void main(String[] args) {
        TreeServices treeServices = new TreeServices();
        //treeServices.traverseInOrderUsingRecursion(treeServices.createTree());
        // treeServices.getLeftViewOfTree(treeServices.createDiffTree(),1);
        // treeServices.getRightViewOfTree(treeServices.createDiffTree(),1);
        /*Node root = treeServices.createTree();
        treeServices.getMirrorViewOfTree(root);
        treeServices.traverseInOrderUsingRecursion(root);*/

        //Node root1= treeServices.createDiffTree();
        //treeServices.getLeftViewOfTree2(root1, 1);

        Node node = treeServices.mirrorViewOfTree2(treeServices.createTree3());
       // treeServices.inOrderTraversal(node);
        treeServices.inOrderTraversal2(node);

    }


    //Left-Root->Right -< 1 2 3 4 5 6 7 8
    private void traverseInOrderUsingRecursion(Node root) {
        if (root.left != null) {
            traverseInOrderUsingRecursion(root.left);
        }
        System.out.println(root.data);
        if (root.right != null) {
            traverseInOrderUsingRecursion(root.right);
        }

    }
    //PostOrder -> Left->Right->Root -> 1 3 2 5 7 6 4

    private void getLeftViewOfTree(Node root, int height) {

        if (root == null) {
            return;
        }
        if (max_height < height) {
            System.out.println(root.data);
            max_height = height;
        }
        getLeftViewOfTree(root.left, height + 1);
        getLeftViewOfTree(root.right, height + 1);
    }

    private void getRightViewOfTree(Node root, int height) {

        if (root == null) {
            return;
        }
        if (max_height < height) {
            System.out.println(root.data);
            max_height = height;
        }
        getRightViewOfTree(root.right, height + 1);
        getRightViewOfTree(root.left, height + 1);

    }

    /*
         4
     2        6
   1    3   5    7*/
    /*private Node getMirrorViewOfTree(Node node) {

        if (node == null)
            return node;

        *//* do the subtrees *//*
        Node left = getMirrorViewOfTree(node.left);
        Node right = getMirrorViewOfTree(node.right);

        *//* swap the left and right pointers *//*
        node.left = right;
        node.right = left;

        return node;

        *//*
         4
     6        2
   7    5   3    1*//*
    }
*/
    private Node createTree() {
        Node root = null;
        root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        root.right.left = new Node(5);
        root.right.right = new Node(7);
        return root;
    }

    private Node createDiffTree() {

         /*
          4
   2            6
1     3      5      7
        9      11
*/
        Node root = null;
        root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);

        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.left.right.right = new Node(9);

        root.right.left = new Node(5);
        root.right.left.right = new Node(11);
        root.right.right = new Node(7);
        return root;
    }


    public void getLeftViewOfTree2(Node root, int current_height) {

        if (root == null) {
            return;
        }

        if (max_height < current_height) {
            System.out.println(root.data);
            max_height = current_height;
        }
        getLeftViewOfTree2(root.left, current_height + 1);
        getLeftViewOfTree2(root.right, current_height + 1);

    }


    public Node mirrorViewOfTree2(Node root) {
        Node temp = null;
        Node right = null;
        Node left = null;
        if (root != null) {
            left = mirrorViewOfTree2(root.left);
            right = mirrorViewOfTree2(root.right);

            temp = left;
            root.left = right;
            root.right = temp;
        }
        return root;
    }

    public Node createTree3() {
        Node root = new Node(6);
        root.left = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(5);

        root.right = new Node(8);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        return root;
    }

    public void inOrderTraversal2(Node root) {
        if (root != null) {
            if (root.left != null) {
                inOrderTraversal2(root.left);
            }
            System.out.print(" "+root.data);
            if (root.right != null) {
                inOrderTraversal2(root.right);
            }
        }
    }


}
