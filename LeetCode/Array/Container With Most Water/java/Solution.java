class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int area=0;
        int right=height.length-1;
        
        for(int i=0;i<height.length;i++)
        {
           int l=right-left;
           int b=Math.min(height[left],height[right]);
            area=Math.max(area,l*b);
            if(height[left]>height[right]) right--;
            else left++;
           
        }return area;
    }
}