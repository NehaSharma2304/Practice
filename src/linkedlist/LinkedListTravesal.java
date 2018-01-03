package linkedlist;

public class LinkedListTravesal {

    Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] str) {
        LinkedListTravesal obj = new LinkedListTravesal();
        obj.head = new Node(1);
        Node sec = new Node(2);
        Node third = new Node(3);
        obj.head.next = sec;
        sec.next = third;
        obj.printLinkedList();
    }

    void printLinkedList() {
        Node traverse = head;
        while (traverse != null) {
            System.out.println(traverse.data);
            traverse = traverse.next;
        }
    }
}
