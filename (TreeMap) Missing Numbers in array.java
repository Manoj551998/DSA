public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here
        
        List<Integer>ls=new ArrayList<>();
        TreeMap<Integer,Integer>m1=new TreeMap<>();
        TreeMap<Integer,Integer>m2=new TreeMap<>();
        for(int i=0;i<arr.size();i++)
        {
            if(m1.containsKey(arr.get(i)))
            {
                m1.put(arr.get(i),m1.get(arr.get(i))+1);
            }
            else
            {
                m1.put(arr.get(i),1);
            }
        }
        for(int i=0;i<brr.size();i++)
        {
            if(m2.containsKey(brr.get(i)))
            {
                m2.put(brr.get(i),m2.get(brr.get(i))+1);
            }
            else
            {
                m2.put(brr.get(i),1);
            }
        }
        for(int e:m2.keySet())
        {
            if(m1.containsKey(e))
            {
                if(m2.get(e)>m1.get(e))
                {
                    ls.add(e);
                }
            }
            else
            {
                ls.add(e);
            }
        }
       return ls; 
    }
 
}
