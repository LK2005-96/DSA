class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        String ans="";
        int count=0;
        for(char c:s.toCharArray())
        {   sb.append(c);
            if(c=='(') count++;
            if(c==')') count--;
            if(count==0) 
            {
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length()-1);
                ans+=sb.toString();
                //System.out.print(sb.toString());
                sb.setLength(0);
             }
         } 
         return ans;
}}