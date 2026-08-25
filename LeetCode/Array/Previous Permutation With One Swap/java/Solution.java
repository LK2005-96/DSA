class Solution {
    public int[] prevPermOpt1(int[] arr) {

        // Step 1: Find pivot from right
        int i = arr.length - 2;

        while (i >= 0 && arr[i] <= arr[i + 1]) {
            i--;
        }

        // No previous permutation
        if (i < 0) {
            return arr;
        }

        // Step 2: Find the largest element smaller than arr[i]
        int j = arr.length - 1;

        while (arr[j] >= arr[i]) {
            j--;
        }

        // Handle duplicates: choose the leftmost occurrence
        while (j > i + 1 && arr[j] == arr[j - 1]) {
            j--;
        }

        // Step 3: One swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
}