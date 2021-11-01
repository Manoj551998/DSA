public static String twoStrings(String s1, String s2) {
    // Write your code here
    TreeSet<Character>set=new TreeSet<>();
    boolean flag=false;
        for(int i=0;i<s1.length();i++)
        {
            set.add(s1.charAt(i));
        }
    for(int i=0;i<s2.length();i++)
    {
        if(set.contains(s2.charAt(i)))
        {
        flag=true;
        break;
        }
    }
    if(flag)
    return "YES";
    else
    return "NO";

    }
