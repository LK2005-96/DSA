/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum=0;
    int cur=0;
    public void summ(TreeNode root,int cur)
    {
        if(root==null) return;
        cur=cur*10 + root.val;
        if(root.left==null && root.right==null)
        {
            sum+=cur;
            cur%=10;
        }
        summ(root.left,cur);
        summ(root.right,cur);
    }
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        summ(root,cur);
        return sum;
    }
}