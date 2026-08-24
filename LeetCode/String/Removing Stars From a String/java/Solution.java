class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c!='*') st.push(c);
            else st.pop();
        }
        StringBuilder k=new StringBuilder();
        for(char c:st) k.append(c);
        return k.toString();
    }
}