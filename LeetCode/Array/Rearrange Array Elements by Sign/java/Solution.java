class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] arr=new int[nums.length];
        int i=0;
        int j=1;
        for(int n:nums)
        {
            if(n>0)
            {
                arr[i]=n;
                i=i+2;
            }
           else 
            {
                arr[j]=n;
                j=j+2;
            }
        }
        //System.gc();
         return arr;
    }
}