class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] k=new int[256];
        int[] j=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);               
            char ch2=t.charAt(i);
            if(k[ch1]==0&&j[ch2]==0) 
            {
                k[ch1]=ch2;
                j[ch2]=ch1;
            }
            else if(k[ch1]!=ch2||j[ch2]!=ch1) return false;
        }return true;

    }
}