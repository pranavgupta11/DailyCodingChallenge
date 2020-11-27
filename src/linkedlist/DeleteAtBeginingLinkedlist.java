package linkedlist;

public class DeleteAtBeginingLinkedlist {
    static Node deleteBegining(Node head) {
	if (head == null)
	    return null;
	else
	    return head.next;
    }

    public static void main(String args[]) {

	Node head = new Node(10);
	head.next = new Node(20);
	head.next.next = new Node(30);
	printlist(head);
	System.out.println(" ");
	head = deleteBegining(head);
	printlist(head);

    }

    public static void printlist(Node head) {
	Node curr = head;
	while (curr != null) {
	    System.out.print(curr.data + " ");
	    curr = curr.next;
	}
    }
}
