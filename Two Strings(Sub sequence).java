int a1[]=new int[26];
        boolean flag=false;
        for(int i=0;i<s1.length();i++)
        {
            a1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            if(a1[s2.charAt(i)-'a']>0)
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
