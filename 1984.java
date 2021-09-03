class Solution {
    public int minimumDifference(int[] nums, int k) {
                if(k==1)
        {
            return 0;
        }
        int a=0;
        for (int i=0;i<nums.length;i++)
        {
            for (int j=0;j<nums.length-1;j++)
            {
                if (nums[j]<nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }

        int count=Integer.MAX_VALUE;
        int m=k-1;
        for (int i=0;i<=nums.length-k;i++)
        {
          count=Math.min(count,Math.abs(nums[i]-nums[i+m]));
        }
        return count;


    }
}
