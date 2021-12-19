public class Accenture2 {
	static int isSubstring(String s1, String s2)
		{
			int M = s1.length();
			int N = s2.length();

			/* A loop to slide pat[] one by one */
			for (int i = 0; i <= N - M; i++) {
				int j;

				/* For current index i, check for
				pattern match */
				for (j = 0; j < M; j++)
					if (s2.charAt(i + j)
						!= s1.charAt(j))
						break;

				if (j == M)
					return i;
			}

			return -1;
		}
	
	//str1="Geeks for"
	//str2="for"

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Geeks for geeks";
		String s2="for";
		System.out.println(isSubstring(s2,s1)); 

	}

}
