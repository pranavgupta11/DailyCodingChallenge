package linkedlist;

public class InsertAtEndDoublyLinkedlist {
    public static void main(String args[]) 
    { 
        DNode head=new DNode(10);
    	DNode temp1=new DNode(20);
    	DNode temp2=new DNode(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
    	head=insertEnd(head,40);
    	printlist(head);
    	
    } 
    
    static DNode insertEnd(DNode head,int data){
        DNode temp=new DNode(data);
        if(head==null)return temp;
        DNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
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
