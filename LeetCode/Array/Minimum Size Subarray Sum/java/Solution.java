class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        while(r<nums.length)
        {
            sum+=nums[r];
            while(sum>=target)
            {
                minlen=Math.min(minlen,r-l+1);
                sum-=nums[l++];
            } r++;
        }
        if(minlen==Integer.MAX_VALUE) return 0;
        return minlen;
    }
}