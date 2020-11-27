package linkedlist;

public class DeleteBeginingDoublyLinkedlist {
    public static void main(String args[]) {
	DNode head = new DNode(10);
	DNode temp1 = new DNode(20);
	DNode temp2 = new DNode(30);
	head.next = temp1;
	temp1.prev = head;
	temp1.next = temp2;
	temp2.prev = temp1;
	head = delHead(head);
	printlist(head);

    }

    static DNode delHead(DNode head) {
	if (head == null)
	    return null;
	if (head.next == null) {
	    return null;
	} else {
	    head = head.next;
	    head.prev = null;
	    return head;
	}
    }

    public static void printlist(DNode head) {
	DNode curr = head;
	while (curr != null) {
	    System.out.print(curr.data + " ");
	    curr = curr.next;
	}
	System.out.println();
    }
}
