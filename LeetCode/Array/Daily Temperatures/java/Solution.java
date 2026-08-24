class Solution {
    public int[] dailyTemperatures(int[] t) {
        int arr[]=new int[t.length];
       // Arrays.fill(arr,0);
        Stack <Integer> stack=new Stack<>();
        for(int i=0;i<t.length;i++)
        {
            while(!stack.isEmpty() && t[stack.peek()] < t[i])
            {  int l=stack.pop();
                arr[l]=i-l;
            } stack.push(i);
        } return arr;
    }
}