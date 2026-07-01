class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> ss=new HashSet<>();
        int max=0;
        int c=0;
        while(c<s.length())
        {
            if(ss.add(s.charAt(c))) 
            {   ss.add(s.charAt(c)); 
                c++;
               max= Math.max(max,ss.size());
            }
            else 
            {
                max=Math.max(max,ss.size());               
                ss.clear();  
                System.out.print(max);        
            }
        } return max;
    }
}