class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int arr[]=new int[2];
        int i=0;
        for(int k:nums)
        {
            if(!s.add(k)) arr[i++]=k;
        } return arr;
    }
}