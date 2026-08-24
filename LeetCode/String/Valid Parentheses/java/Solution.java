public class Solution {
    public boolean isValid(String s) {
        // Use a char array as a stack
        char[] stack = new char[s.length()];
        int top = -1; // stack pointer

        for (char c : s.toCharArray()) {
            // If opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else {
                // If stack is empty, no matching opening
                if (top == -1) return false;

                // Check for correct matching pair
                if ((c == ')' && stack[top] != '(') ||
                    (c == '}' && stack[top] != '{') ||
                    (c == ']' && stack[top] != '[')) {
                    return false;
                }
                top--; // pop the matched opening
            }
        }

        // If stack is empty, all brackets matched
        return top == -1;
    }
}
