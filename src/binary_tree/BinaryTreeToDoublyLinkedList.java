package binary_tree;

public class BinaryTreeToDoublyLinkedList {
    
    /***
     *    10 root
     *   /  \
     *  5    20 
     *      /  \
     *     30    35 
     * Inorder traversal required
     * Doubly linkedlist will be -> 5 10 30 20 35
     */
    
    public static void main(String args[]) {
	Node root = new Node(10);
	root.left = new Node(5);
	root.right = new Node(20);
	root.right.left = new Node(30);
	root.right.right = new Node(35);

	Node head = BTToDLL(root);
	printlist(head);
    }

    static Node prev = null;

    public static Node BTToDLL(Node root) {
	if (root == null)
	    return root;

	Node head = BTToDLL(root.left);
	if (prev == null) {
	    head = root;
	} else {
	    root.left = prev;
	    prev.right = root;
	}
	prev = root;
	BTToDLL(root.right);
	return head;
    }

    public static void printlist(Node head) {
	Node curr = head;
	while (curr != null) {
	    System.out.print(curr.key + " ");
	    curr = curr.right;
	}
    }
}
