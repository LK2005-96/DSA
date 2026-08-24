class Solution {
    int count=0;
    public void backtrack(String tiles, boolean[] used, String current) {

    if (current.length() > 0) {
       count++;
    }
     boolean[] levelUsed = new boolean[26];
     for (int i = 0; i < tiles.length(); i++) {
        char ch=tiles.charAt(i);
        if (used[i])
            continue;
        if (levelUsed[ch - 'A'])
                continue;
        levelUsed[ch - 'A'] = true;
        used[i] = true;

        backtrack(tiles, used, current +ch);

        used[i] = false;
    }} 
    public int numTilePossibilities(String s) {
        boolean arr[]=new boolean[s.length()];
	    backtrack(s,arr,"");
        return count;
    }}