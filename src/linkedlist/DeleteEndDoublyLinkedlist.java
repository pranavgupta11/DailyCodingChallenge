package linkedlist;

public class DeleteEndDoublyLinkedlist {
    public static void main(String args[]) 
    { 
        DNode head=new DNode(10);
    	DNode temp1=new DNode(20);
    	DNode temp2=new DNode(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
    	head=delLast(head);
    	printlist(head);
    	
    } 
    
    static DNode delLast(DNode head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }    
        DNode curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.prev.next=null;
        return head;
        
    }
    
    public static void printlist(DNode head){
        DNode curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
}
