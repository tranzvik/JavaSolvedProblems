package LinkedListProbs;

/**
 * Reverse Nodes in k-Group
 * https://github.com/doocs/leetcode/blob/main/solution/0000-0099/0025.Reverse%20Nodes%20in%20k-Group/README_EN.md
 *
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [2,1,4,3,5]
 *
 * Input: head = [1,2,3,4,5], k = 3
 * Output: [3,2,1,4,5]
 */
public class ReverseNodesKGroup {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);
        root.next.next.next.next = new Node(5);

        reverseKGroups(root,2 );




    }

    public static void reverseKGroups(Node root, int k) {

    }
}

