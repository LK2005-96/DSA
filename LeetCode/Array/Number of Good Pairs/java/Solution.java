class Solution {
    public int numIdenticalPairs(int[] nums) {

        int arr[] = new int[101];
        int sum = 0;
        for(int i : nums){
            sum += arr[i]++;
            // System.out.print(sum+" ");
        }
        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = i+1 ; j < nums.length; j++){
        //         if(nums[i] == nums[j])sum++;
        //     }
        // }
        return sum;
    }
}