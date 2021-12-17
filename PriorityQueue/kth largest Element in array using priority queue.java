import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Practice {

	
	public static void main(String args[])
	{
		PriorityQueue<Integer>pq=new PriorityQueue<>();//max heap
		//program to find 2nd larget(greater) element in array
		int a[]= {2,3,1,4,5,7,9};
		int size=3;
		for(int ans:a)
		{
			pq.add(ans);
			if(pq.size()>size)
				pq.remove();
		}
		System.out.println("The "+size+" largest element is:"+pq.peek());
		Arrays.sort(a);
		for(int an:a)
		{
			System.out.print(an+" ");
		}
		
	}
}
