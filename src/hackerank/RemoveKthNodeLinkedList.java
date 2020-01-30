package hackerank;

public class RemoveKthNodeLinkedList {
    static class Node {
        int data;
        Node next;
    }

    static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Utility function to create a new node.
    static Node newNode(int x) {
        Node temp = new Node();
        temp.data = x;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        /* Start with the empty list */
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(5);
        head.next.next.next.next.next = newNode(6);
        head.next.next.next.next.next.next = newNode(7);
        head.next.next.next.next.next.next.next = newNode(8);

        int k = 3;
        head = removeKthNodeFromEnd(head, k);

        displayList(head);
    }


    public static Node removeKthNodeFromEnd(Node head, int k) {
        while (head != null && head.data == k) {
            head = head.next;
        }
        Node current_node = head;
        while (current_node != null && current_node.next != null) {
            if (current_node.next.data == k) {
                current_node.next = current_node.next.next;
            } else {
                current_node = current_node.next;
            }
        }
        return head;
    }


}
