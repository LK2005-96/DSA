class Solution {
    public int removeDuplicates(int[] nums) { 
        int index=1;
        int prev=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[prev]!=nums[i])
            {  nums[index]=nums[i];
                prev=index;
               index++;
            }
        }
        
        return prev+1;
    }
}