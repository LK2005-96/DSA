class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {  List<Integer> a=row(i);
            ans.add(a);
        }
        return ans;
    }
    public List<Integer> row(int row)
    {
        int ans=1;
        List<Integer> ansrow = new ArrayList<>();
        ansrow.add(1);
        for(int col=1; col<row;col++)
        {
            ans=ans*(row-col);
            ans=ans/(col);
            ansrow.add(ans);
        }
        return ansrow;
    }
}