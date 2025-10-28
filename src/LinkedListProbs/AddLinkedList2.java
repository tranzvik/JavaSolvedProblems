package LinkedListProbs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddLinkedList2 {

    static int carry = 0;
    static List<Integer> num = new ArrayList<>();

    public static void main(String[] args) {

        Node root1 = createFirstLinkedList();
        Node root2 = createSecondLinkedList();
        calculateSum(root1, root2);

        if (carry != 0) {
            num.add(carry);
        }

        Collections.reverse(num);
        System.out.println(num);

    }


    public static void calculateSum(Node root1, Node root2) {
        if (root1.next != null && root2.next != null) {
            calculateSum(root1.next, root2.next);
        }

        int sum = carry + root1.data + root2.data;
        if (sum > 10) {
            carry = 1;
            num.add(sum % 10);
        } else {
            carry = 0;
            num.add(sum);
        }


    }

    public static Node createFirstLinkedList() {

        Node root = new Node(9);
        Node n2 = new Node(9);
        Node n3 = new Node(9);
        root.next = n2;
        n2.next = n3;
        n3.next = null;
        return root;
    }

    public static Node createSecondLinkedList() {
        Node root = new Node(1);
        Node n2 = new Node(9);
        Node n3 = new Node(8);
        root.next = n2;
        n2.next = n3;
        n3.next = null;
        return root;

    }
}
