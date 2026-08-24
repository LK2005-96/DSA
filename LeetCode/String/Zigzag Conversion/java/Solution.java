class Solution {
    public String convert(String s, int numRows) {
        if(numRows ==1 || numRows>=s.length())
         return s;
        StringBuilder arr[]=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            arr[i]=new StringBuilder();
        }
        int row=0;
        int down=0;
        for(char c:s.toCharArray())
        {
            arr[row].append(c);
            if(row==numRows-1) down=-1;
            if(row==0) down =1;
            row+=down;
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder g:arr)
        {
            ans.append(g);
        }
        return ans.toString();
    }
}