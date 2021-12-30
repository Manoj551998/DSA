import java.util.*;
class NodeCreation
{
	int val;
	NodeCreation next;
	NodeCreation(int v,NodeCreation n)
	{
		val=v;
		next=n;
	}
}
class StackImplementation
{
	NodeCreation head;
	StackImplementation()
	{
		head=null;
	}
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		else
			return false;
	}
	public void push(int val)
	{
		if(head==null)
		{
			head=new NodeCreation(val,null);
			return;
		}
		NodeCreation temp=new NodeCreation(val,head);
		head=temp;
	}
	public void pop()
	{
		if(head==null)
		{
			System.out.println("Stack is Empty there is No element to pop");
			return;
		}
		head=head.next;
		System.out.println("Last Element popped Successfully");
	}
	public int peek()
	{
			if(head==null)
				return -1;
			else
				return head.val;
	}
	public int poll()
	{
		if(head==null)
			return -1;
		else
		{
			int val=peek();
			head=head.next;
			return val;
		}
	}
}
public class StackImpleFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StackImplementation stk=new StackImplementation();
		boolean flag=true;
		while(flag)
		{
			System.out.println("1.push \n2.pop \n3.isEmpty \n4.peek \n5.poll");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the element to push");
				int inp=sc.nextInt();
				stk.push(inp);
				System.out.println("----------------------------------------------");
				break;	
			}
			case 2:
			{
				stk.pop();
				System.out.println("----------------------------------------------");
				break;
			}
			case 3:
			{
				System.out.println(stk.isEmpty());
				System.out.println("----------------------------------------------");
				break;
			}
			case 4:
			{
				System.out.println(stk.peek());
				System.out.println("----------------------------------------------");
				break;
			}
			case 5:
			{
				System.out.println(stk.poll());
				System.out.println("Last Element polled Successfully");
				System.out.println("----------------------------------------------");
				break;
			}
			case 6:
			{
				flag=false;
				System.out.println("Execution termiunared successfully");
				System.out.println("----------------------------------------------");
			}
			default:
				System.out.println("Invalid input");
			}
		}

	}

}
