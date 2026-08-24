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
    public TreeNode construct(int arr[],int left,int right)
    {   if(left>right) return null;
        int max=left;
        for(int i=left+1;i<=right;i++)
        {  if(arr[max]<arr[i]) max=i;      
        }
        TreeNode root=new TreeNode(arr[max]);
        root.left=construct(arr,left,max-1);
        root.right=construct(arr,max+1,right);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return construct(nums,0,nums.length-1);
    }
}