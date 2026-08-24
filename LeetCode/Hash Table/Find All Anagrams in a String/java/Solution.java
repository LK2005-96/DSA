import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();
        if (sLen < pLen) return result;    
        int[] pCounts = new int[26];
        int[] sCounts = new int[26];       
        for (int i = 0; i < pLen; i++) {
            pCounts[p.charAt(i) - 'a']++;
            sCounts[s.charAt(i) - 'a']++;
        }
        if (matches(pCounts, sCounts)) {
            result.add(0);
        }
        for (int i = 0; i < sLen - pLen; i++) {
            sCounts[s.charAt(i) - 'a']--;
            sCounts[s.charAt(i + pLen) - 'a']++;
            if (matches(pCounts, sCounts)) {
                result.add(i + 1);
            }
        }
        return result;
    }
    
    // Helper method to compare two frequency arrays in O(1) constant time
    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}