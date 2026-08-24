class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        int m=arr.length;
        int count=0;
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
        int end =arr[0][1];
        for(int i=1;i<m;i++)
        {
            
                if(arr[i][0]<end) count++;
                else end=arr[i][1];
        }
        return count;
    }
}