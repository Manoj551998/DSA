class Solution {
    public int largestRectangleArea(int[] heights) {
      int n=heights.length;
        int l[]= new int[n];
        int r[]=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++)
        {
        	while(!s.isEmpty()&&heights[s.peek()]>=heights[i])
        	{
        		s.pop();
        	}
        	if(s.isEmpty())
        		l[i]=0;
        	else
        		l[i]=s.peek()+1;
        		s.push(i);
        }
        s.clear();
        for(int i=n-1;i>=0;i--)
        {
        	while(!s.isEmpty()&&heights[s.peek()]>=heights[i])
        	{
        		s.pop();
        	}
        	if(s.isEmpty())
        		r[i]=n-1;
        	else
        		r[i]=s.peek()-1;
        		s.push(i);
        }
        
        int ans=0;
        for(int i=0;i<n;i++)
        	 ans=Math.max(ans, heights[i] * (r[i] - l[i] + 1));
        
        return ans;
      
    }
}
