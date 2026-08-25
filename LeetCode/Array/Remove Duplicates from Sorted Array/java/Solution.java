class Solution {
    public int removeDuplicates(int[] nums) {
        int arr[]=new int[nums.length];
        int index=1;
        int prev=0;
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(arr[prev]!=nums[i])
            {  arr[index]=nums[i];
                prev=index;
               index++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }
        System.out.print(Arrays.toString(arr));
        return prev+1;
    }
}