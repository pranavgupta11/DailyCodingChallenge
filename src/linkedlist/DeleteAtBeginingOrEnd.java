package linkedlist;

public class DeleteAtBeginingOrEnd {
    static Node insertBegin(Node head, int x) {
	Node temp = new Node(x);
	temp.next = head;
	return temp;
    }

    static Node insertEnd(Node head, int x) {
	Node temp = new Node(x);
	if (head == null) {
	    return temp;
	}
	Node curr = head;
	while (curr.next != null) {
	    curr = curr.next;
	}
	curr.next = temp;
	return head;
    }

    public static void main(String args[]) {

	Node head = null;
	head = insertBegin(head, 30);
	head = insertBegin(head, 20);
	head = insertBegin(head, 10);
	printlist(head);
	System.out.println(" ");
	Node head1 = null;
	head1 = insertEnd(head1, 10);
	head1 = insertEnd(head1, 20);
	head1 = insertEnd(head1, 30);
	printlist(head1);

    }

    public static void printlist(Node head) {
	Node curr = head;
	while (curr != null) {
	    System.out.print(curr.data + " ");
	    curr = curr.next;
	}
    }
}
