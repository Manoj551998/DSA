import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int sum=0;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            if(!map.containsKey(a[i])&&sum<=k)
            {
                
                count++;
                map.put(a[i],i);
               
            }
            else
            {
                sum-=a[i];
            }
            
        }
        System.out.print(count);
    }
}
