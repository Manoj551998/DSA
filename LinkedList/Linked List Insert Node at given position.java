class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		next=null;
	}
}
class LLimplementation
{
	Node head=null;
	void push(int val)
	{
		if(head==null)
		{
			head=new Node(val);
			return;
		}
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(val);
	}
	void traverse()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data);
			if(curr.next!=null)
			{
				System.out.print("-->");
			}
			curr=curr.next;
		}	
	}
	void insert(int pos,int val)
	{
		int c=1;
		Node curr=head;
		if(pos==1)
		{
			head=new Node(val);
			head.next=curr;
			return;
		}
		while(c<pos-1)
		{
			curr=curr.next;
			
			//System.out.println(curr.data);
			c++;
		}
		//System.out.println(curr.next.data);
		Node next=curr.next;
		
		curr.next=new Node(val);
		curr.next.next=next;
			
		
	}
}



public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LLimplementation li=new LLimplementation();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			li.push(sc.nextInt());
		}
		li.traverse();
		li.insert(1,10);
		System.out.println();
		li.traverse();
	}
}
