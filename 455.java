class Solution {
    public int findContentChildren(int[] g, int[] s) {
         Arrays.sort(s);
        Arrays.sort(g);
        int count=0;
        if (g.length==0 || s.length==0){
            return 0;
        }


boolean[] kk=new boolean[s.length];
        boolean[] kkkk=new boolean[g.length];

        for (int i=0;i<s.length;i++){
            if (kk[i]=true){
                for (int j=0;j<g.length;j++){
                   if (kkkk[j]!=true){
                       if (s[i]>=g[j]){
                           count++;
                           kkkk[j]=true;
                           break;
                       }
                   }
                }
            }
            kk[i]=true;

        }

    return count;   
    }
}
