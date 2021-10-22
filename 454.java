class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
              int count=0;
Map<Integer,Integer> mm=new HashMap<>();
        for (var c:nums3) {
            for (var d : nums4) {
                mm.put(c + d, mm.getOrDefault(c + d, 0) + 1);

            }
        }
                for (var a:nums1) {
                    for (var b:nums2) {
                        count=count+mm.getOrDefault(-(a+b),0);
                    }

                }



        return count;
    }
}
