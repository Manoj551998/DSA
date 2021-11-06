import java.util.*;
import java.io.*;

 class DoublyLinkedList {
	 
	class ListNode
	{
		int data;
		ListNode next;
		ListNode prev;
		ListNode(int data)
		{
			this.data=data;
		}
	}
	    ListNode head;
	    ListNode tail;
	    public DoublyLinkedList() {
			// TODO Auto-generated constructor stub
	    	this.head=null;
	    	this.tail=null;	
		}
	    public void addAtEnd(int data)
	    {
	    	ListNode newNode=new ListNode(data);
	    	if(head==null)
	    	{
	    		head=newNode;
	    		
	    	}else
	    	{
	    		tail.next=newNode;
	    		newNode.prev=tail;
	    	}
	    	tail=newNode;
	    }
	    public void traverseForwad()
	    {
	    	while(head!=null)
	    	{
	    		System.out.print(head.data);
	    		if(head.next!=null)
	    		{
	    			System.out.print("--->");
	    		}
	    		head=head.next;
	    	}
	    }
	    public void traverseBackward()
	    {
	    	while(tail!=null)
	    	{
	    		System.out.print(tail.data);
	    		if(tail.prev!=null)
	    		{
	    			System.out.print("--->");
	    		}
	    		tail=tail.prev;
	    	}
	    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	Scanner sc=new Scanner(System.in);
    	DoublyLinkedList meth=new DoublyLinkedList();
    	System.out.println("Enter number of elements");
    	int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			int el=sc.nextInt();
			meth.addAtEnd(el);
		}
		System.out.println("Traversing the linked list");
		meth.traverseForwad();
		System.out.println();
		meth.traverseBackward();
		sc.close();
    }
}
