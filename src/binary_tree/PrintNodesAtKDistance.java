package binary_tree;

public class PrintNodesAtKDistance {
    public static void main(String[] args) {

	Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
    	root.right.right=new Node(70);
    	kDistance(root,2);
    }
    
    public static void kDistance(Node root, int k) {
	if(root==null) return;
	if(k==0) {
	    System.out.println(root.key+" ");
	}
	kDistance(root.left,k-1);
	kDistance(root.right,k-1);
	
    }
}
