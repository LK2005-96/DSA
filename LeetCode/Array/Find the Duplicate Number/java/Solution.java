class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>1) 
            {ans=nums[i];break;}
        }return ans;
    }
}