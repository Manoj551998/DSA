import java.util.Scanner;

class Stack
{
	int top=-1;
	void push(int val,int a[])
	{
		top+=1;
		a[top]=val;
		System.out.println("Value pushed into the stack");
		
	}
	void pop(int a[])
	{
		top-=1;
		System.out.println("Value poped from the stack");
	}
	void peek(int a[])
	{
		if(top>-1)
		System.out.println("The top value in stack is : "+a[top]);
		else
			System.out.println("Stack is empty now");
	}
	void isEmpty()
	{
		if(top<0) System.out.println("Stack is  Empty");
		else System.out.println("Stack is not Empty");
	}
}

public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack stk=new Stack();
		int a[]=new int[10];
		while(true)
		{
			System.out.println("1.push 2.pop 3.peek 4.isempty 5.exit");
			int in=sc.nextInt();
			if(in==1) {System.out.println("Enter the value to push:"); int val=sc.nextInt();stk.push(val,a);}
			else if(in==2) { stk.pop(a);}
			else if(in==3) stk.peek(a);
			else if(in==4) stk.isEmpty();
			else if(in==5) break;
			else System.out.println("enter valid input");
			System.out.println("-------------------------------");
		}
		System.out.println("loop terminated successflly");
		
	}
}
