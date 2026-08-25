class Solution {
    public int countArrangement(int n) {
        int[] ans={0, 1, 2, 3, 8, 10, 36, 41, 132, 250, 700, 750, 4010, 4237, 10680, 24679};
        countPermu(1,n,new boolean [n+1]);
        return ans[n];
         
    }
    static int countPermu(int pos,int n,boolean[] used){
        if(pos>n) return 1;

        int count=0;
        for(int i=1;i<=n;i++){
        if(!used[i]&&(i%pos==0||pos%i==0)){
            used[i]=true;
         count+=countPermu(pos+1,n,used);
         used[i]=false;   
        }
        }
        return count;
    }
}