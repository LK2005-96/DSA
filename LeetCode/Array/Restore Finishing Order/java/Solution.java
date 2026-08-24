class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int []arr=new int[friends.length];
        int i=0;
        for(int k:order)
        {
            for(int l:friends)
            {
                if(k==l) arr[i++]=k;
            }
        }return arr;
    }
}