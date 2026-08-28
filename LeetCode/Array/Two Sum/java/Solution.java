class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ar[]=new int[2];
        for(int i=0;i<arr.length;i++)
		{
		    int get=target-arr[i];
		    for(int j=i+1;j<arr.length;j++)
		    {
		        if(arr[j]==get) 
		        {
		            ar[0]=i;
                    ar[1]=j;
                    break;
		        }
		    }
         } return ar;
}}