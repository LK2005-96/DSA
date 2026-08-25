class Solution {
    // static {
    //     for (int i = 0; i<300; i++) {
    //         removeOuterParentheses("()");
    //     }
    // }
    public static String removeOuterParentheses(String s) {
        if (s.length() < 3) return "";
        
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count != 0)     sb.append('(');
                count++;
            } else {
                count--;
                if (count != 0)     sb.append(')');
            }
        }

        return sb.toString();
    }
}