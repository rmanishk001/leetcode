
import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
           Arrays.sort(nums);
        int count=0;
        for (int i=0,j=nums.length-1;i<nums.length/2;i++,j--)
        {
            int count2=nums[i]+nums[j];
            if (count2>count)
            {
                count=count2;
            }
        }
        return count;
        
    }
}
