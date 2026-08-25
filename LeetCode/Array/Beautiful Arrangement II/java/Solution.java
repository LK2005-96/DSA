class Solution {
    public int[] constructArray(int n, int k) {

        int[] ans = new int[n];

        int left = 1;
        int right = k + 1;
        int index = 0;

        while (left <= right) {

            if (index % 2 == 0) {
                ans[index++] = left++;
            } else {
                ans[index++] = right--;
            }
        }

        int num = k + 2;

        while (index < n) {
            ans[index++] = num++;
        }

        return ans;
    }
}