class Solution {
    public List<List<Integer>> permute(int[] arr) {
        int n =arr.length;
        List<List<Integer>> result = permute(arr,n);
       return result;
    }
     public static List<List<Integer>> permute(int[] arr , int n)
    {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        backtrack(arr,n,0,new ArrayList<>(),visited,res);
        return res;
    }
    public static void backtrack(int[] arr , int n , int index , List<Integer> current,boolean[]visited,List<List<Integer>>result)
    {
        if(current.size() == n)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                visited[i] = true;
            
            current.add(arr[i]);
            backtrack(arr,n,i+1,current,visited,result);
            current.remove(current.size()-1);
            visited[i] = false;
        }
        }
    }
}