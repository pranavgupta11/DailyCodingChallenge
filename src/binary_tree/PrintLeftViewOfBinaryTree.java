package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftViewOfBinaryTree {
    

    public static void main(String[] args) {

	Node root = new Node(10);
	root.left = new Node(20);
	root.right = new Node(30);
	root.left.left = new Node(40);
	root.left.right = new Node(50);
	root.right.left = new Node(60);
	root.right.right = new Node(70);

	// Recursive solution
	printLeftView1(root, 1);
	System.out.println();
	printLeftView2(root);
    }
    static int MaxLevel = 0;
    public static void printLeftView1(Node root, int level) {
	if (root == null)
	    return;
	if (MaxLevel < level) {
	    System.out.println(root.key + " ");
	    MaxLevel = level;
	}
	printLeftView1(root.left, level + 1);
	printLeftView1(root.right, level + 1);
    }

    public static void printLeftView2(Node root) {
	if (root == null)
	    return;
	Queue<Node> q = new LinkedList<>();
	q.add(root);
	q.add(null);
	while (q.size() > 1) {
	    int count = q.size();
	    for (int i = 0; i < count; i++) {
		Node curr = q.poll();
		if (curr == null) {
		    System.out.println();
		    q.add(null);
		    continue;
		}
		if (i == 0)
		    System.out.print(curr.key + " ");
		if (curr.left != null)
		    q.add(curr.left);
		if (curr.right != null)
		    q.add(curr.right);
	    }

	}

    }
}
