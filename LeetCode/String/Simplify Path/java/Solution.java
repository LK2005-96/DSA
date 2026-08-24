class Solution {
    public String simplifyPath(String path) {
        int n = path.length();
        String[] stack = new String[n];
        int top = 0;
        int i = 0;
        while (i < n) {
            while (i < n && path.charAt(i) == '/') {
                i++;
            }
            if (i >= n) break;
            int start = i;
            while (i < n && path.charAt(i) != '/') {
                i++;
            }
            int len = i - start;
            if (len == 1 && path.charAt(start) == '.') {
                continue;
            } else if (len == 2 && path.charAt(start) == '.' && path.charAt(start + 1) == '.') {
                if (top > 0) top--;
            } else {
                stack[top++] = path.substring(start, i);
            }
        }
        if (top == 0) return "/";
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < top; j++) {
            sb.append('/').append(stack[j]);
        }
        return sb.toString();
    }
}