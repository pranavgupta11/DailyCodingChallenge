package hackerank;

public class AddKthNodeLinkedList {
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
        head = insertNodeAtPosition(head, 9, k);

        displayList(head);
    }


    public static Node insertNodeAtPosition(Node head, int data, int position) {
        Node new_node = newNode(data);
        Node current_node = head;
        int index = 0;
        while (index < position - 1) {
            current_node = current_node.next;
            index++;
        }
        new_node.next = current_node.next;
        current_node.next = new_node;
        return head;
    }


}

