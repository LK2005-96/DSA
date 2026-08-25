class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int maxVal = 0;
        for (int num : nums2) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        int[] map = new int[maxVal + 1];
        int [] stack=new int[nums2.length];
        int top = -1;
        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];
            while (top>=0 && stack[top] <= current) {
                top--;
            }
            if (top==-1) {
                map[current] = -1;
            } else {
                map[current] = stack[top];
            }
            stack[++top]=current;
        }
       // System.out.print(stack);
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map[nums1[i]];
        }

        return ans;
    }
}