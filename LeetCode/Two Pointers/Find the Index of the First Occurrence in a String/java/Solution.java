class Solution {
    public int strStr(String haystack, String needle) {
        int l=needle.length();

        for(int i=0;i+l<=haystack.length();i++)
        {
             String g=haystack.substring(i,i+l);
             if(needle.equals(g)) 
             {return i;}
        }
        return -1;
    }
}