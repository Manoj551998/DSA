import java.util.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();//a1b10
		int len=str.length();
		HashMap<Character,Integer>map=new HashMap<>();
		char lastCh=' ';
		String string="";
		Stack<Character>ch=new Stack<>();
		for(int i=0;i<len;i++)
		{
			if((str.charAt(i)>='a'&&str.charAt(i)<='z'))
			{
				map.put(str.charAt(i), 1);
				lastCh=str.charAt(i);
				ch.push(str.charAt(i));
				
			}
			else
			{
				if(lastCh>='a'&&lastCh<='z')
				{
					map.put(lastCh,Character.getNumericValue(str.charAt(i)));
					lastCh=str.charAt(i);
					
				}
				else if(lastCh!=' ')//ignoring the starting character as number in given string
				{
					map.put(ch.pop(),(Character.getNumericValue(lastCh)*10)+Character.getNumericValue(str.charAt(i)));
				}
			}
		}
		 for (HashMap.Entry<Character,Integer> entry : map.entrySet())
		 {
			 for(int i=0;i<entry.getValue();i++)
			 {
				 string+=entry.getKey();
			 }
	            //System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
		 }
		 System.out.println(string);
		}

}
