class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int [nums.length*2];
        int i=0;
        int count=0;
        while(count<2)
        {
            for(int j=0;j<nums.length;j++)
            {
                arr[i]=nums[j];
                i++;
            }
            count++;
        }
        return arr;
    }
}