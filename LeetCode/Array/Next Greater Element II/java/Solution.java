class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int[] stack=new int[n];
        int top=-1;
        Arrays.fill(result,-1);
        for(int i=0; i<n*2; i++){
            int num=nums[i%n];
            while(top>=0 && nums[stack[top]] < num){
                result[stack[top]]=num;
                top--;
            }
            if(i<n){
                stack[++top]=i;
            }
        }
        return result;
    }
}