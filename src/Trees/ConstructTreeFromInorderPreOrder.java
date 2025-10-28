package Trees;

public class ConstructTreeFromInorderPreOrder {

    public static void main(String[] args) {
        int[] inorder = {3, 1, 4, 0, 5, 2};   //Left - Root -Right
        int[] preorder = {0, 1, 3, 4, 2, 5};  //Root - Left -Right

        // o/p [0, 1, 2, 3, 4, 5]

        /*
                    0
             1             2
         3      4               5
         */

        //3 1 4 0 2 5

        Node root = constructTree(preorder, inorder, 0, 0, preorder.length - 1);
        printInorder(root);

    }

    private static void printInorder(Node root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    public static int searchIndexInInorderList(int[] inOrder, int element, int left, int right) {

        for (int i = left; i <= right; i++) {
            if (inOrder[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static Node constructTree(int[] preOrder, int[] inOrder, int preIndex, int left, int right) {


        if (left > right) {
            return null;
        }

        Node root = new Node(preOrder[preIndex]);
        preIndex++;

        int index = searchIndexInInorderList(inOrder, preOrder[preIndex], left, right);

        //construct right subtree
        constructTree(preOrder, inOrder, preIndex, left, index - 1);


        //construct left subtree
        constructTree(preOrder, inOrder, preIndex, index + 1, right);

        return root;
    }

}
