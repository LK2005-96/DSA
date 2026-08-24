class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int j=0;j<nums1.length;j++)
        {   int target=nums1[j];
            int index = IntStream.range(0, nums2.length)
                     .filter(i -> nums2[i] == target)
                     .findFirst()
                     .orElse(-1);
            boolean k=false;
            for(int l=index+1;l<nums2.length;l++)
            {
                if(nums2[l]>nums1[j])
                {
                    nums1[j]=nums2[l];
                    k=true;
                    break;
                }
            }
            if(!k)  nums1[j]=-1;
            if(index==nums2.length-1) nums1[j]=-1;

        } return nums1;
    }
}