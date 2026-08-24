class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack=new Stack<>();
        String g="";
        int index=0;
        boolean k=false;
        for(char c:word.toCharArray())
        {
              stack.push(c);
              index++;
              if(c==ch)
              { k=true;
                while(!stack.isEmpty()){ g+=stack.pop();}
                break;
              }
        }
        for(int i=index;i<word.length();i++)
        {
            g+=word.charAt(i);
        }
        if(k)return g;
        return word;
    }
}