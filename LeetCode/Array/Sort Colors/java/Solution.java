class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i];
        
    }
    System.out.println(Arrays.toString(nums));
    }
}