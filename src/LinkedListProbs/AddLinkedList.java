package LinkedListProbs;

import java.util.ArrayList;
import java.util.List;

public class AddLinkedList {
    int carry;
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        AddLinkedList addLinkedList = new AddLinkedList();
        Node root1 = addLinkedList.createLikedList1();
        Node root2 = addLinkedList.createLikedList2();
        addLinkedList.calculateSum(root1, root2);
        System.out.println(addLinkedList.list);
    }

    private void calculateSum(Node root1, Node root2) {

        //1-->2---3
        //4--5-->6
        if (root1.next != null && root2.next != null && root1.visited==false && root2.visited==false) {

            calculateSum(root1.next, root2.next);
        }

        int current_sum = 0;
        current_sum = root1.data + root2.data;
        this.list.add(current_sum);
        root1.visited=true;
        root2.visited=true;

    }

    private Node createLikedList1() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        return node1;
    }

    private Node createLikedList2() {
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        Node node3 = new Node(7);
        node1.next = node2;
        node2.next = node3;
        return node1;
    }
}


//MINUS LINKEDLIST
//PARANTHESIS AS STACK AND RECURSION
//FB
//DECORATOR PATTERN
//
