class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int x1=0;
        int y1=1;
        int in1=0;
        int in2=n;
        for(int i=0;i<nums.length;i=i+2)
        {
           arr[x1]=nums[in1];
           arr[y1]=nums[in2];
           x1+=2;
           y1+=2;
           in1++;
           in2++;
        }
        return arr;
    }
}