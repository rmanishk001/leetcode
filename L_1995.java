class Solution {
    public int countQuadruplets(int[] array) {
            int count=0;
         int a=array.length;
        for (int i=0;i<a-3;i++){
           for (int j=i+1;j<a-2;j++)
           {
                   for (int k=j+1;k<a-1;k++)
                   {
                       for (int m=k+1;m<a;m++)
                       {
                       if ((array[i]+array[j]+array[k])==array[m])
                       {
                         count++;
                       }
                   }
               }
           }
        }            return count;

        
    }
}
