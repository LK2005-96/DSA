class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        int n=nums.length;
        int sum=n*(n+1)/2;
        int dup=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums)
        {
            if(set.add(i)) dup+=i;
            map.put(i,map.getOrDefault(i,0)+1);
        } 
        int num=sum-dup;
        int arr[]=new int[2];
        System.out.print(num);
        for(int i=0;i<nums.length;i++)
        {   if(map.get(nums[i])==2)
            {
                  arr[0]=nums[i];
                  arr[1]=num;
            }
        } 
        return arr;
    }
}