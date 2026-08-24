class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums.length == 0) return result;
        
        int left = findLeftBound(nums, target);
        if (left == -1) return result;
     
        int right = findRightBound(nums, target);
        
        result[0] = left;
        result[1] = right;
        return result;
    }
    
    private int findLeftBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                result = mid; 
                right = mid - 1; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
    private int findRightBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                result = mid; 
                left = mid + 1; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}