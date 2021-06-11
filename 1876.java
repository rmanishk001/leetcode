class Solution {
    public int countGoodSubstrings(String s) {
   int a=0;
        for (int i=0;i<s.length()-2;i++)
        {
            String vl=s.substring(i,i+3);
            int count=0;
            for (int j=0;j<vl.length();j++)
            {
                for (int k=0;k<vl.length();k++)
                {
                    if (j!=k)
                    {
                        if (vl.charAt(j)==vl.charAt(k))
                        {
                            count++;
                        }
                    }
                }
            }
            if (count==0)
            {
                a++;
            }
        }
        return a;   
    }
}
